package com.lianggege.xiaoxiguclub.web.controller;

import com.lianggege.xiaoxiguclub.model.Episode;
import com.lianggege.xiaoxiguclub.service.EpisodeService;
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
public class EpisodeController {

    @Autowired
    private EpisodeService episodeService;

    /**
     * 根据小戏骨作品ID查询小戏骨作品剧集信息
     * @param id
     * @return
     */
    @RequestMapping("/episode/{id}")
    @ResponseBody
    public Map<String, Object> getEpisodesByWid(@PathVariable("id") String id) {
        List<Episode> episodes = episodeService.getEpisodesByWid(id);
        Map<String, Object> retMap = new ConcurrentHashMap<>(1);
        retMap.put("episodes", episodes);
        return retMap;
    }
}
