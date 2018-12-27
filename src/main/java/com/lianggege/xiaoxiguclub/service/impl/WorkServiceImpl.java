package com.lianggege.xiaoxiguclub.service.impl;

import com.lianggege.xiaoxiguclub.mapper.WorkMapper;
import com.lianggege.xiaoxiguclub.model.Work;
import com.lianggege.xiaoxiguclub.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author :Wang Mingliang
 * Date: 2018-12-27
 */
@Service
public class WorkServiceImpl implements WorkService {

    @Autowired
    private WorkMapper workMapper;

    /**
     * 查询默认显示的小戏骨作品
     *
     * @param paramMap
     * @return
     */
    @Override
    public List<Work> getDefaultDisplayWorks(Map<String, Object> paramMap) {
        return workMapper.selectDefaultDisplayWorks(paramMap);
    }

    /**
     * 查询更多小戏骨作品
     *
     * @param paramMap
     * @return
     */
    @Override
    public List<Work> getWorks(Map<String, Object> paramMap) {
        return workMapper.selectWorks(paramMap);
    }
}
