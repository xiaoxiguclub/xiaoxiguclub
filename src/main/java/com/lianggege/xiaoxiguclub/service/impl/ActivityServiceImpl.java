package com.lianggege.xiaoxiguclub.service.impl;

import com.lianggege.xiaoxiguclub.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author :Wang Mingliang
 * Date: 2018-12-27
 */
@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityMapper activityMapper;

    /**
     * 分页查询小戏骨动态
     *
     * @param paramMap
     * @return
     */
    @Override
    public List<Activity> getActivitiesByPage(Map<String, Object> paramMap) {
        return activityMapper.selectActivitiesByPage(paramMap);
    }

    /**
     * 查询小戏骨动态总数量
     *
     * @return
     */
    @Override
    public Long getActivitiesTotal() {
        return activityMapper.selectActivitiesTotal();
    }

    /**
     * 根据小戏骨成员ID查询小戏骨动态
     *
     * @param paramMap
     * @return
     */
    @Override
    public List<Activity> getActivitiesBySid(Map<String, Object> paramMap) {
        return activityMapper.selectActivitiesBySid(paramMap);
    }

    /**
     * 根据小戏骨成员ID查询小戏骨动态数量
     *
     * @param paramMap
     * @return
     */
    @Override
    public Long getActivitiesTotalBySid(Map<String, Object> paramMap) {
        return activityMapper.selectActivitiesTotalBySid(paramMap);
    }
}
