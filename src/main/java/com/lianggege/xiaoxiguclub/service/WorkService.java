package com.lianggege.xiaoxiguclub.service;

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

    /**
     * 根据小戏骨成员ID查询小戏骨作品
     *
     * @param paramMap
     * @return
     */
    List<Work> getWorksBySid(Map<String, Object> paramMap);

    /**
     * 根据小戏骨成员ID查询小戏骨作品数量
     *
     * @param paramMap
     * @return
     */
    Long getWorksTotalBySid(Map<String, Object> paramMap);
}
