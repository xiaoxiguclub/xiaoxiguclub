package com.lianggege.xiaoxiguclub.service;

import com.lianggege.xiaoxiguclub.model.Episode;

import java.util.List;

/**
 * @author :Wang Mingliang
 * Date: 2018-12-27
 */
public interface EpisodeService {

    /**
     * 根据小戏骨作品ID查询小戏骨作品剧集信息
     *
     * @param id
     * @return
     */
    List<Episode> getEpisodesByWid(String id);
}
