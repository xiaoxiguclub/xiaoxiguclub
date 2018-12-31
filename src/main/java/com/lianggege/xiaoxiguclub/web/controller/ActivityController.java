package com.lianggege.xiaoxiguclub.web.controller;

import com.lianggege.xiaoxiguclub.service.ActivityService;
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
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    /**
     * 跳转到小戏骨动态页面
     *
     * @return
     */
    @RequestMapping("/activities")
    public String toActivities() {
        return "activities";
    }

    /**
     * 分页查询小戏骨动态
     *
     * @param currentPage
     * @return
     */
    @RequestMapping("/activities/{currentPage}")
    @ResponseBody
    public Object getActivitiesByPage(@PathVariable("currentPage") Integer currentPage) {
        Map<String, Object> paramMap = new ConcurrentHashMap<>(2);
        paramMap.put("startIndex", (currentPage - 1) * 10 + 1);
        paramMap.put("endIndex", currentPage * 10);
        List<Activity> activities = activityService.getActivitiesByPage(paramMap);
        Long activitiesTotal = activityService.getActivitiesTotal();
        Map<String, Object> retMap = new ConcurrentHashMap<>(2);
        retMap.put("activities", activities);
        retMap.put("activitiesTotal", activitiesTotal);
        return retMap;
    }

    /**
     * 分页查询小戏骨个人动态
     *
     * @param id
     * @param currentPage
     * @return
     */
    @RequestMapping("/activities/{id}/{currentPage}")
    @ResponseBody
    public Object getActivitiesBySId(@PathVariable("id") String id, @PathVariable("currentPage") Integer currentPage) {
        Map<String, Object> paramMap = new ConcurrentHashMap<>(3);
        paramMap.put("sid", id);
        paramMap.put("startIndex", (currentPage - 1) * 5 + 1);
        paramMap.put("endIndex", currentPage * 5);
        List<Activity> activities = activityService.getActivitiesBySid(paramMap);
        Long activitiesTotal = activityService.getActivitiesTotalBySid(paramMap);
        Map<String, Object> retMap = new ConcurrentHashMap<>(2);
        retMap.put("activities", activities);
        retMap.put("activitiesTotal", activitiesTotal);
        return retMap;
    }

}
