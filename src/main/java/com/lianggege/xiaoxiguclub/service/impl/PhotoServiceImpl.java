package com.lianggege.xiaoxiguclub.service.impl;

import com.lianggege.xiaoxiguclub.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author :Wang Mingliang
 * Date: 2018-12-27
 */
@Service
public class PhotoServiceImpl implements PhotoService {

    @Autowired
    private PhotoMapper photoMapper;

    /**
     * 分页查询小戏骨图片
     *
     * @param paramMap
     * @return
     */
    @Override
    public List<Photo> getPhotosByPage(Map<String, Object> paramMap) {
        return photoMapper.selectPhotosByPage(paramMap);
    }
}
