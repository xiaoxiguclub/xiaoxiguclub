package com.lianggege.xiaoxiguclub.service;

import com.lianggege.xiaoxiguclub.model.Star;

import java.util.List;
import java.util.Map;

/**
 * @author :Wang Mingliang
 * Date: 2018-12-27
 */
public interface StarService {

    /**
     * 查询默认显示的小戏骨成员
     *
     * @param paramMap
     * @return
     */
    List<Star> getDefaultDisplayStars(Map<String, Object> paramMap);

    /**
     * 查询更多小戏骨成员
     *
     * @param paramMap
     * @return
     */
    List<Star> getStars(Map<String, Object> paramMap);

    /**
     * 根据ID查询小戏骨成员信息
     *
     * @param id
     * @return
     */
    Star getStarById(String id);
}
