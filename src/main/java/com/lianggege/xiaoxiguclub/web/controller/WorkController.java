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
     * @return
     */
    @RequestMapping("/works")
    public String toWorks() {
        return "works";
    }

    @RequestMapping("/works/{currentPage}")
    @ResponseBody
    public Object getWorksByPage(@PathVariable("currentPage") Integer currentPage) {
        Map<String, Object> paramMap = new ConcurrentHashMap<>(2);
        List<Work> works;
        if (currentPage == 1) {
            //查询默认显示的小戏骨作品
            paramMap.put("startIndex", (currentPage - 1) * 8 + 1);
            works = workService.getDefaultDisplayWorks(paramMap);
        } else {
            //查询更多小戏骨作品
            paramMap.put("startIndex", (currentPage - 2) * 8);
            works = workService.getWorks(paramMap);
        }
        paramMap.put("endIndex", currentPage * 8);
        Map<String, Object> retMap = new ConcurrentHashMap<>(8);
        retMap.put("works", works);
        return retMap;
    }
}
