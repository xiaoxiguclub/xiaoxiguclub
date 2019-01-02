package com.lianggege.xiaoxiguclub.web.controller;

import com.lianggege.xiaoxiguclub.model.Star;
import com.lianggege.xiaoxiguclub.model.Work;
import com.lianggege.xiaoxiguclub.service.StarService;
import com.lianggege.xiaoxiguclub.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public class IndexController {

    @Autowired
    private StarService starService;
    @Autowired
    private WorkService workService;

    /**
     * 跳转到首页
     *
     * @return
     */
    @RequestMapping("/")
    public String toIndex() {
        return "index";
    }

    /**
     * @param model
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public Map index(Model model) {
        //封装参数
        Map<String, Object> paramMap = new ConcurrentHashMap<>(2);
        paramMap.put("startIndex", 1);
        paramMap.put("endIndex", 8);
        //查询默认显示的小戏骨成员
        List<Star> stars = starService.getDefaultDisplayStars(paramMap);
        //查询默认显示的小戏骨作品
        List<Work> works = workService.getDefaultDisplayWorks(paramMap);
        Map<String, Object> retMap = new ConcurrentHashMap<>(2);
        retMap.put("stars", stars);
        retMap.put("works", works);
        return retMap;
    }
}
