package com.lianggege.xiaoxiguclub.service.impl;

import com.lianggege.xiaoxiguclub.mapper.EpisodeMapper;
import com.lianggege.xiaoxiguclub.model.Episode;
import com.lianggege.xiaoxiguclub.service.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author :Wang Mingliang
 * Date: 2018-12-27
 */
@Service
public class EpisodeServiceImpl implements EpisodeService {

    @Autowired
    private EpisodeMapper episodeMapper;

    /**
     * 根据小戏骨作品ID查询小戏骨作品剧集信息
     *
     * @param id
     * @return
     */
    @Override
    public List<Episode> getEpisodesByWid(String id) {
        return episodeMapper.selectEpisodesByWid(id);
    }
}
