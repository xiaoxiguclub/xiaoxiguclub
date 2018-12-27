package com.lianggege.xiaoxiguclub.web.controller;

import com.lianggege.xiaoxiguclub.model.Star;
import com.lianggege.xiaoxiguclub.service.StarService;
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
public class StarController {

    @Autowired
    private StarService starService;

    /**
     * 跳转到小戏骨成员页面
     *
     * @return
     */
    @RequestMapping("/stars")
    public String toStars() {
        return "stars";
    }

    /**
     * 分页查询小戏骨成员
     *
     * @return
     */
    @RequestMapping("/stars/{currentPage}")
    @ResponseBody
    public Object getStarsByPage(@PathVariable("currentPage") Integer currentPage) {
        Map<String, Object> paramMap = new ConcurrentHashMap<>(2);
        List<Star> stars;
        if (currentPage == 1) {
            //查询默认显示的小戏骨成员
            paramMap.put("startIndex", (currentPage - 1) * 8 + 1);
            paramMap.put("endIndex", currentPage * 8);
            stars = starService.getDefaultDisplayStars(paramMap);
        } else {
            //查询更多小戏骨成员
            paramMap.put("startIndex", (currentPage - 2) * 8 + 1);
            paramMap.put("endIndex", (currentPage - 1) * 8);
            stars = starService.getStars(paramMap);
        }
        Map<String, Object> retMap = new ConcurrentHashMap<>(8);
        retMap.put("stars", stars);
        return retMap;
    }
}
