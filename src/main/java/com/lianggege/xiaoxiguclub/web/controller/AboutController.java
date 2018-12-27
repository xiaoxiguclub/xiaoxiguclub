package com.lianggege.xiaoxiguclub.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Wang Mingliang
 * Date 2018/12/27 0027 21:32
 */
@Controller
public class AboutController {

    /**
     * 跳转到关于我们页面
     *
     * @return
     */
    @RequestMapping("/about")
    public String toAbout() {
        return "about";
    }
}
