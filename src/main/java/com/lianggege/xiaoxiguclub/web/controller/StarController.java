package com.lianggege.xiaoxiguclub.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :Wang Mingliang
 * Date: 2018-12-27
 */
@Controller
public class StarController {

    /**
     * 跳转到小戏骨成员页面
     *
     * @return
     */
    @RequestMapping("/stars")
    public String toStars() {
        return "stars";
    }
}
