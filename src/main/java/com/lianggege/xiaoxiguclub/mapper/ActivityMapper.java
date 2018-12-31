package com.lianggege.xiaoxiguclub.mapper;

import com.lianggege.xiaoxiguclub.model.Activity;

import java.util.List;
import java.util.Map;

public interface ActivityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIVITY
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIVITY
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    int insert(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIVITY
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    int insertSelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIVITY
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    Activity selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIVITY
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    int updateByPrimaryKeySelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIVITY
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    int updateByPrimaryKey(Activity record);

    /**
     * 分页查询小戏骨动态
     *
     * @param paramMap
     * @return
     */
    List<Activity> selectActivitiesByPage(Map<String, Object> paramMap);

    /**
     * 查询小戏骨动态总数量
     *
     * @return
     */
    Long selectActivitiesTotal();

    /**
     * 根据小戏骨成员ID查询小戏骨动态
     *
     * @param paramMap
     * @return
     */
    List<Activity> selectActivitiesBySid(Map<String, Object> paramMap);

    /**
     * 根据小戏骨成员ID查询小戏骨动态数量
     *
     * @param paramMap
     * @return
     */
    Long selectActivitiesTotalBySid(Map<String, Object> paramMap);
}