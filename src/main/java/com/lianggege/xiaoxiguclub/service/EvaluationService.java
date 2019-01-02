package com.lianggege.xiaoxiguclub.service;

import com.lianggege.xiaoxiguclub.model.Evaluation;

import java.util.List;
import java.util.Map;

/**
 * @author :Wang Mingliang
 * Date: 2018-12-27
 */
public interface EvaluationService {

    /**
     * 根据小戏骨成员ID查询小戏骨人物评价
     *
     * @param paramMap
     * @return
     */
    List<Evaluation> getEvaluationsBySid(Map<String, Object> paramMap);
}
