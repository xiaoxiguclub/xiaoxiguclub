package com.lianggege.xiaoxiguclub.web.controller;

import com.lianggege.xiaoxiguclub.model.*;
import com.lianggege.xiaoxiguclub.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @Autowired
    private ActivityService activityService;

    @Autowired
    private WorkService workService;

    @Autowired
    private AwardrecordService awardrecordService;

    @Autowired
    private EvaluationService evaluationService;

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

    /**
     * 跳转小戏骨个人信息详情页
     *
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/star/{id}")
    public String toStar(Model model, @PathVariable("id") String id) {
        model.addAttribute("id", id);
        return "star";
    }

    /**
     * 查询小戏骨个人信息详情
     *
     * @param id
     * @param currentPage
     * @return
     */
    @RequestMapping("/star/{id}/{currentPage}")
    @ResponseBody
    public Object getStarById(@PathVariable("id") String id,
                              @PathVariable("currentPage") Integer currentPage) {

        Map<String, Object> paramMap = new ConcurrentHashMap<String, Object>(3);
        paramMap.put("sid", id);
        paramMap.put("startIndex", (currentPage - 1) * 5 + 1);
        paramMap.put("endIndex", currentPage * 5);

        //根据ID查询小戏骨成员信息
        Star star = starService.getStarById(id);

        //根据小戏骨成员ID查询小戏骨动态
        List<Activity> activities = activityService.getActivitiesBySid(paramMap);
        //根据小戏骨成员ID查询小戏骨动态数量
        Long activitiesTotal = activityService.getActivitiesTotalBySid(paramMap);

        //根据小戏骨成员ID查询小戏骨作品
        List<Work> works = workService.getWorksBySid(paramMap);
        //根据小戏骨成员ID查询小戏骨作品数量
        Long worksTotal = workService.getWorksTotalBySid(paramMap);

        //根据小戏骨成员ID查询小戏骨获奖记录
        List<Awardrecord> awardrecords = awardrecordService.getAwardrecordsBySid(paramMap);
        //根据小戏骨成员ID查询小戏骨获奖记录数量
        Long awardrecordsTotal = awardrecordService.getAwardrecordsTotalBySid(paramMap);

        //根据小戏骨成员ID查询小戏骨人物评价
        List<Evaluation> evaluations = evaluationService.getEvaluationsBySid(paramMap);

        Map<String, Object> retMap = new ConcurrentHashMap<>(8);
        retMap.put("star", star);
        retMap.put("activities", activities);
        retMap.put("activitiesTotal", activitiesTotal);
        retMap.put("works", works);
        retMap.put("worksTotal", worksTotal);
        retMap.put("awardrecords", awardrecords);
        retMap.put("awardrecordsTotal", awardrecordsTotal);
        retMap.put("evaluations", evaluations);

        return retMap;
    }
}
