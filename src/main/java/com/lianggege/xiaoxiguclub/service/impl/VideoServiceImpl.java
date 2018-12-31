package com.lianggege.xiaoxiguclub.service.impl;

import com.lianggege.xiaoxiguclub.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author :Wang Mingliang
 * Date: 2018-12-27
 */
@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    /**
     * 分页查询小戏骨视频
     *
     * @param paramMap
     * @return
     */
    @Override
    public List<Video> getVideosByPage(Map<String, Object> paramMap) {
        return videoMapper.selectVideosByPage(paramMap);
    }
}
