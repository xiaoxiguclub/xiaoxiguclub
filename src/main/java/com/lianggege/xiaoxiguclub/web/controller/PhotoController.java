package com.lianggege.xiaoxiguclub.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :Wang Mingliang
 * Date: 2018-12-27
 */
@Controller
public class PhotoController {

    /**
     * 跳转到小戏骨图片页面
     *
     * @return
     */
    @RequestMapping("/photos")
    public String toPhotos() {
        return "photos";
    }
}
