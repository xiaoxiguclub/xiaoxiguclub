package com.lianggege.xiaoxiguclub.mapper;

import com.lianggege.xiaoxiguclub.model.Work;

import java.util.List;
import java.util.Map;

public interface WorkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WORK
     *
     * @mbggenerated Thu Dec 27 12:40:41 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WORK
     *
     * @mbggenerated Thu Dec 27 12:40:41 CST 2018
     */
    int insert(Work record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WORK
     *
     * @mbggenerated Thu Dec 27 12:40:41 CST 2018
     */
    int insertSelective(Work record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WORK
     *
     * @mbggenerated Thu Dec 27 12:40:41 CST 2018
     */
    Work selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WORK
     *
     * @mbggenerated Thu Dec 27 12:40:41 CST 2018
     */
    int updateByPrimaryKeySelective(Work record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WORK
     *
     * @mbggenerated Thu Dec 27 12:40:41 CST 2018
     */
    int updateByPrimaryKey(Work record);

    /**
     * 查询默认显示的小戏骨作品
     *
     * @param paramMap
     * @return
     */
    List<Work> selectDefaultDisplayWorks(Map<String, Object> paramMap);

    /**
     * 查询更多小戏骨作品
     *
     * @param paramMap
     * @return
     */
    List<Work> selectWorks(Map<String, Object> paramMap);

    /**
     * 根据小戏骨成员ID查询小戏骨作品
     *
     * @param paramMap
     * @return
     */
    List<Work> selectWorksBySid(Map<String, Object> paramMap);

    /**
     * 根据小戏骨成员ID查询小戏骨作品数量
     *
     * @param paramMap
     * @return
     */
    Long selectWorksTotalBySid(Map<String, Object> paramMap);
}