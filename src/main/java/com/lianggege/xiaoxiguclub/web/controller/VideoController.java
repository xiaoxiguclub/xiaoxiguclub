package com.lianggege.xiaoxiguclub.web.controller;

import com.lianggege.xiaoxiguclub.model.Video;
import com.lianggege.xiaoxiguclub.service.VideoService;
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
public class VideoController {

    @Autowired
    private VideoService videoService;

    /**
     * 跳转到小戏骨视频页面
     *
     * @return
     */
    @RequestMapping("/videos")
    public String toVideos() {
        return "videos";
    }

    /**
     * 分页查询小戏骨视频
     *
     * @param currentPage
     * @return
     */
    @RequestMapping("/videos/{currentPage}")
    @ResponseBody
    public Object getVideoByPage(@PathVariable("currentPage") Integer currentPage) {
        Map<String, Object> paramMap = new ConcurrentHashMap<>(2);
        paramMap.put("startIndex", (currentPage - 1) * 10 + 1);
        paramMap.put("endIndex", currentPage * 10);
        Map<String, Object> retMap = new ConcurrentHashMap<>(1);
        List<Video> videos = videoService.getVideosByPage(paramMap);
        retMap.put("videos", videos);
        return retMap;
    }
}
