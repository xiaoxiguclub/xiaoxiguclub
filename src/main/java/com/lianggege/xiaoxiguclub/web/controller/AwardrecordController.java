package com.lianggege.xiaoxiguclub.web.controller;

import com.lianggege.xiaoxiguclub.service.AwardrecordService;
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
public class AwardrecordController {

    @Autowired
    private AwardrecordService awardrecordService;

    /**
     * 分页查询小戏骨个人获奖记录
     *
     * @param id
     * @param currentPage
     * @return
     */
    @RequestMapping("/awardrecords/{id}/{currentPage}")
    @ResponseBody
    public Object getAwardrecordsBySId(@PathVariable("id") String id, @PathVariable("currentPage") Integer currentPage) {
        Map<String, Object> paramMap = new ConcurrentHashMap<>(3);
        paramMap.put("sid", id);
        paramMap.put("startIndex", (currentPage - 1) * 5 + 1);
        paramMap.put("endIndex", currentPage * 5);
        List<Awardrecord> awardrecords = awardrecordService.getAwardrecordsBySid(paramMap);
        Long awardrecordsTotal = awardrecordService.getAwardrecordsTotalBySid(paramMap);
        Map<String, Object> retMap = new ConcurrentHashMap<>();
        retMap.put("awardrecords", awardrecords);
        retMap.put("awardrecordsTotal", awardrecordsTotal);
        return retMap;
    }
}
