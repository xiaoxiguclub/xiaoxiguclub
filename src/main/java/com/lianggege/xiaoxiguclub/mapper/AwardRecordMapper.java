package com.lianggege.xiaoxiguclub.mapper;

import com.lianggege.xiaoxiguclub.model.AwardRecord;

import java.util.List;
import java.util.Map;

public interface AwardRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AWARDRECORD
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AWARDRECORD
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    int insert(AwardRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AWARDRECORD
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    int insertSelective(AwardRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AWARDRECORD
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    AwardRecord selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AWARDRECORD
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    int updateByPrimaryKeySelective(AwardRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AWARDRECORD
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    int updateByPrimaryKey(AwardRecord record);

    /**
     * 根据小戏骨成员ID查询小戏骨获奖记录
     *
     * @param paramMap
     * @return
     */
    List<AwardRecord> selectAwardrecordsBySid(Map<String, Object> paramMap);

    /**
     * 根据小戏骨成员ID查询小戏骨获奖记录数量
     *
     * @param paramMap
     * @return
     */
    Long selectAwardrecordsTotalBySid(Map<String, Object> paramMap);
}