package com.lianggege.xiaoxiguclub.service.impl;

import com.lianggege.xiaoxiguclub.mapper.AwardRecordMapper;
import com.lianggege.xiaoxiguclub.model.AwardRecord;
import com.lianggege.xiaoxiguclub.service.AwardRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author :Wang Mingliang
 * Date: 2018-12-27
 */
@Service
public class AwardRecordServiceImpl implements AwardRecordService {

    @Autowired
    private AwardRecordMapper awardRecordMapper;

    /**
     * 根据小戏骨成员ID查询小戏骨获奖记录
     *
     * @param paramMap
     * @return
     */
    @Override
    public List<AwardRecord> getAwardRecordsBySid(Map<String, Object> paramMap) {
        return awardRecordMapper.selectAwardRecordsBySid(paramMap);
    }

    /**
     * 根据小戏骨成员ID查询小戏骨获奖记录数量
     *
     * @param paramMap
     * @return
     */
    @Override
    public Long getAwardRecordsTotalBySid(Map<String, Object> paramMap) {
        return awardRecordMapper.selectAwardRecordsTotalBySid(paramMap);
    }
}
