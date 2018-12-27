package com.lianggege.xiaoxiguclub.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :Wang Mingliang
 * Date: 2018-12-27
 */
@Controller
public class VideoController {

    /**
     * 跳转到小戏骨视频页面
     *
     * @return
     */
    @RequestMapping("/videos")
    public String toVideos() {
        return "videos";
    }
}
