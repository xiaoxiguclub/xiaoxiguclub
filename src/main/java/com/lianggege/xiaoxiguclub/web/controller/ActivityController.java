package com.lianggege.xiaoxiguclub.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :Wang Mingliang
 * Date: 2018-12-27
 */
@Controller
public class ActivityController {

    /**
     * 跳转到小戏骨动态页面
     *
     * @return
     */
    @RequestMapping("/activities")
    public String toActivities() {
        return "activities";
    }
}
