package com.lianggege.xiaoxiguclub.service.impl;

import com.lianggege.xiaoxiguclub.service.AwardrecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author :Wang Mingliang
 * Date: 2018-12-27
 */
@Service
public class AwardrecordServiceImpl implements AwardrecordService {

    @Autowired
    private AwardrecordMapper awardrecordMapper;

    /**
     * 根据小戏骨成员ID查询小戏骨获奖记录
     *
     * @param paramMap
     * @return
     */
    @Override
    public List<Awardrecord> getAwardrecordsBySid(Map<String, Object> paramMap) {
        return awardrecordMapper.selectAwardrecordsBySid(paramMap);
    }

    /**
     * 根据小戏骨成员ID查询小戏骨获奖记录数量
     *
     * @param paramMap
     * @return
     */
    @Override
    public Long getAwardrecordsTotalBySid(Map<String, Object> paramMap) {
        return awardrecordMapper.selectAwardrecordsTotalBySid(paramMap);
    }
}
