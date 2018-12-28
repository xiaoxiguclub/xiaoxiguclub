package com.lianggege.xiaoxiguclub.mapper;

import com.lianggege.xiaoxiguclub.model.Star;

import java.util.List;
import java.util.Map;

public interface StarMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STAR
     *
     * @mbggenerated Thu Dec 27 12:40:41 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STAR
     *
     * @mbggenerated Thu Dec 27 12:40:41 CST 2018
     */
    int insert(Star record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STAR
     *
     * @mbggenerated Thu Dec 27 12:40:41 CST 2018
     */
    int insertSelective(Star record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STAR
     *
     * @mbggenerated Thu Dec 27 12:40:41 CST 2018
     */
    Star selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STAR
     *
     * @mbggenerated Thu Dec 27 12:40:41 CST 2018
     */
    int updateByPrimaryKeySelective(Star record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STAR
     *
     * @mbggenerated Thu Dec 27 12:40:41 CST 2018
     */
    int updateByPrimaryKey(Star record);

    /**
     * 查询默认显示的小戏骨成员
     *
     * @param paramMap
     * @return
     */
    List<Star> selectDefaultDisplayStars(Map<String, Object> paramMap);

    /**
     * 查询更多小戏骨成员
     *
     * @param paramMap
     * @return
     */
    List<Star> selectStars(Map<String, Object> paramMap);

    /**
     * 根据ID查询小戏骨成员信息
     *
     * @param id
     * @return
     */
    Star selectStarById(String id);
}