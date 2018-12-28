package com.lianggege.xiaoxiguclub.service;

import com.lianggege.xiaoxiguclub.model.Activity;

import java.util.List;
import java.util.Map;

/**
 * @author :Wang Mingliang
 * Date: 2018-12-27
 */
public interface ActivityService {

    /**
     * 分页查询小戏骨动态
     *
     * @param paramMap
     * @return
     */
    List<Activity> getActivitiesByPage(Map<String, Object> paramMap);

    /**
     * 查询小戏骨动态总数量
     *
     * @return
     */
    Long getActivitiesTotal();

    /**
     * 根据小戏骨成员ID查询小戏骨动态
     *
     * @param paramMap
     * @return
     */
    List<Activity> getActivitiesBySid(Map<String, Object> paramMap);
}
