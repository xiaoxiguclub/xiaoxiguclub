package com.lianggege.xiaoxiguclub.service.impl;

import com.lianggege.xiaoxiguclub.mapper.ActivityMapper;
import com.lianggege.xiaoxiguclub.model.Activity;
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
}
