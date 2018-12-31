package com.lianggege.xiaoxiguclub.service.impl;

import com.lianggege.xiaoxiguclub.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author :Wang Mingliang
 * Date: 2018-12-27
 */
@Service
public class EvaluationServiceImpl implements EvaluationService {

    @Autowired
    private EvaluationMapper evaluationMapper;

    /**
     * 根据小戏骨成员ID查询小戏骨人物评价
     *
     * @param paramMap
     * @return
     */
    @Override
    public List<Evaluation> getEvaluationsBySid(Map<String, Object> paramMap) {
        return evaluationMapper.selectEvaluationsBySid(paramMap);
    }
}
