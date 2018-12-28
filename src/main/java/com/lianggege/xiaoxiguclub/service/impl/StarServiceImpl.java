package com.lianggege.xiaoxiguclub.service.impl;

import com.lianggege.xiaoxiguclub.mapper.StarMapper;
import com.lianggege.xiaoxiguclub.model.Star;
import com.lianggege.xiaoxiguclub.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author :Wang Mingliang
 * Date: 2018-12-27
 */
@Service
public class StarServiceImpl implements StarService {

    @Autowired
    private StarMapper starMapper;

    /**
     * 查询默认显示的小戏骨成员
     *
     * @param paramMap
     * @return
     */
    @Override
    public List<Star> getDefaultDisplayStars(Map<String, Object> paramMap) {
        return starMapper.selectDefaultDisplayStars(paramMap);
    }

    /**
     * 查询更多小戏骨成员
     *
     * @param paramMap
     * @return
     */
    @Override
    public List<Star> getStars(Map<String, Object> paramMap) {
        return starMapper.selectStars(paramMap);
    }

    /**
     * 根据ID查询小戏骨成员信息
     *
     * @param id
     * @return
     */
    @Override
    public Star getStarById(String id) {
        return starMapper.selectByPrimaryKey(id);
    }
}
