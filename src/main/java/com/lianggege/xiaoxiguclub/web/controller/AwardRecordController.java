package com.lianggege.xiaoxiguclub.web.controller;

import com.lianggege.xiaoxiguclub.model.AwardRecord;
import com.lianggege.xiaoxiguclub.service.AwardRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author :Wang Mingliang
 * Date: 2018-12-27
 */
@Controller
public class AwardRecordController {

    @Autowired
    private AwardRecordService awardRecordService;

    /**
     * 分页查询小戏骨个人获奖记录
     *
     * @param id
     * @param currentPage
     * @return
     */
    @RequestMapping("/awardRecords/{id}/{currentPage}")
    @ResponseBody
    public Object getAwardRecordsBySid(@PathVariable("id") String id, @PathVariable("currentPage") Integer currentPage) {
        Map<String, Object> paramMap = new ConcurrentHashMap<>(3);
        paramMap.put("sid", id);
        paramMap.put("startIndex", (currentPage - 1) * 5 + 1);
        paramMap.put("endIndex", currentPage * 5);
        List<AwardRecord> awardRecords = awardRecordService.getAwardRecordsBySid(paramMap);
        Long awardRecordsTotal = awardRecordService.getAwardRecordsTotalBySid(paramMap);
        Map<String, Object> retMap = new ConcurrentHashMap<>(2);
        retMap.put("awardRecords", awardRecords);
        retMap.put("awardRecordsTotal", awardRecordsTotal);
        return retMap;
    }
}
