package com.lianggege.xiaoxiguclub.web.controller;

import com.lianggege.xiaoxiguclub.model.Photo;
import com.lianggege.xiaoxiguclub.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author :Wang Mingliang
 * Date: 2018-12-27
 */
@Controller
public class PhotoController {

    @Autowired
    private PhotoService photoService;

    /**
     * 跳转到小戏骨图片页面
     *
     * @return
     */
    @RequestMapping("/photos")
    public String toPhotos() {
        return "photos";
    }

    /**
     * 分页查询小戏骨图片
     *
     * @param currentPage
     * @return
     */
    @RequestMapping("/photos/{currentPage}")
    @ResponseBody
    public Object getPhotosByPage(@PathVariable("currentPage") Integer currentPage) {
        Map<String, Object> paramMap = new ConcurrentHashMap<>(2);
        paramMap.put("startIndex", (currentPage - 1) * 20 + 1);
        paramMap.put("endIndex", currentPage * 20);
        Map<String, Object> retMap = new ConcurrentHashMap<>(1);
        List<Photo> photos = photoService.getPhotosByPage(paramMap);
        retMap.put("photos", photos);
        return retMap;
    }
}
