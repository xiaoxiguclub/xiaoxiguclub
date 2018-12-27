package com.lianggege.xiaoxiguclub.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Wang Mingliang
 * Date 2018/12/27 0027 21:43
 */
@Controller
public class ContactController {

    /**
     * 跳转到联系我们页面
     *
     * @return
     */
    @RequestMapping("/contact")
    public String toContact() {
        return "contact";
    }
}
