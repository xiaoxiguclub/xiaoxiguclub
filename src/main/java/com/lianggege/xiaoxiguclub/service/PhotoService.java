package com.lianggege.xiaoxiguclub.service;

import java.util.List;
import java.util.Map;

/**
 * @author :Wang Mingliang
 * Date: 2018-12-27
 */
public interface PhotoService {

    /**
     * 分页查询小戏骨图片
     *
     * @param paramMap
     * @return
     */
    List<Photo> getPhotosByPage(Map<String, Object> paramMap);
}
