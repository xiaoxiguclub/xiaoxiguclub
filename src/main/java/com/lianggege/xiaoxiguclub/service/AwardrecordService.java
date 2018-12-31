package com.lianggege.xiaoxiguclub.service;

import java.util.List;
import java.util.Map;

/**
 * @author :Wang Mingliang
 * Date: 2018-12-27
 */
public interface AwardrecordService {

    /**
     * 根据小戏骨成员ID查询小戏骨获奖记录
     *
     * @param paramMap
     * @return
     */
    List<Awardrecord> getAwardrecordsBySid(Map<String, Object> paramMap);

    /**
     * 根据小戏骨成员ID查询小戏骨获奖记录数量
     *
     * @param paramMap
     * @return
     */
    Long getAwardrecordsTotalBySid(Map<String, Object> paramMap);
}
