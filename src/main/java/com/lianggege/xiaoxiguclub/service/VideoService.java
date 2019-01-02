package com.lianggege.xiaoxiguclub.service;

import com.lianggege.xiaoxiguclub.model.Video;

import java.util.List;
import java.util.Map;

/**
 * @author :Wang Mingliang
 * Date: 2018-12-27
 */
public interface VideoService {

    /**
     * 分页查询小戏骨视频
     *
     * @param paramMap
     * @return
     */
    List<Video> getVideosByPage(Map<String, Object> paramMap);
}
