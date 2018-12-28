package com.lianggege.xiaoxiguclub.web.controller;

import com.lianggege.xiaoxiguclub.model.Work;
import com.lianggege.xiaoxiguclub.service.WorkService;
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
public class WorkController {

    @Autowired
    private WorkService workService;

    /**
     * 跳转到小戏骨作品页面
     *
     * @returna
     */
    @RequestMapping("/works")
    public String toWorks() {
        return "works";
    }

    /**
     * 分页查询小戏骨作品
     *
     * @param currentPage
     * @return
     */
    @RequestMapping("/works/{currentPage}")
    @ResponseBody
    public Object getWorksByPage(@PathVariable("currentPage") Integer currentPage) {
        Map<String, Object> paramMap = new ConcurrentHashMap<>(2);
        List<Work> works;
        if (currentPage == 1) {
            //查询默认显示的小戏骨作品
            paramMap.put("startIndex", (currentPage - 1) * 8 + 1);
            paramMap.put("endIndex", currentPage * 8);
            works = workService.getDefaultDisplayWorks(paramMap);
        } else {
            //查询更多小戏骨作品
            paramMap.put("startIndex", (currentPage - 2) * 8 + 1);
            paramMap.put("endIndex", (currentPage - 1) * 8);
            works = workService.getWorks(paramMap);
        }
        Map<String, Object> retMap = new ConcurrentHashMap<>(8);
        retMap.put("works", works);
        return retMap;
    }

    /**
     * 分页查询小戏骨个人作品
     *
     * @param id
     * @param currentPage
     * @return
     */
    @RequestMapping("/works/{id}/{currentPage}")
    @ResponseBody
    public Object getWorksBySid(@PathVariable("id") String id, @PathVariable("currentPage") Integer currentPage) {
        Map<String, Object> paramMap = new ConcurrentHashMap<>(3);
        paramMap.put("sid", id);
        paramMap.put("startIndex", (currentPage - 1) * 5 + 1);
        paramMap.put("endIndex", currentPage * 5);
        List<Work> works = workService.getWorksBySid(paramMap);
        Long worksTotal = workService.getWorksTotalBySid(paramMap);
        Map<String, Object> retMap = new ConcurrentHashMap<>();
        retMap.put("works", works);
        retMap.put("worksTotal", worksTotal);
        return retMap;
    }
}
