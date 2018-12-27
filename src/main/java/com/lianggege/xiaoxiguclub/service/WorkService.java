package com.lianggege.xiaoxiguclub.service;

import com.lianggege.xiaoxiguclub.model.Work;

import java.util.List;
import java.util.Map;

/**
 * @author :Wang Mingliang
 * Date: 2018-12-27
 */
public interface WorkService {

    /**
     * 查询默认显示的小戏骨作品
     *
     * @param paramMap
     * @return
     */
    List<Work> getDefaultDisplayWorks(Map<String, Object> paramMap);

    /**
     * 查询更多小戏骨作品
     *
     * @param paramMap
     * @return
     */
    List<Work> getWorks(Map<String, Object> paramMap);
}
