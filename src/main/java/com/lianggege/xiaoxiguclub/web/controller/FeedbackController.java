package com.lianggege.xiaoxiguclub.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Wang Mingliang
 * Date 2018/12/27 0027 21:45
 */
@Controller
public class FeedbackController {

    /**
     * 跳转到建议反馈页面
     *
     * @return
     */
    @RequestMapping("/feedback")
    public String toFeedback() {
        return "feedback";
    }
}
