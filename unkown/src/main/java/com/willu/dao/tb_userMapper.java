package com.willu.dao;

import com.willu.model.tb_user;

public interface tb_userMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Thu Oct 13 10:18:29 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Thu Oct 13 10:18:29 CST 2016
     */
    int insert(tb_user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Thu Oct 13 10:18:29 CST 2016
     */
    int insertSelective(tb_user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Thu Oct 13 10:18:29 CST 2016
     */
    tb_user selectByPrimaryKey(Integer id);
    
    tb_user selectByUsername(String username);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Thu Oct 13 10:18:29 CST 2016
     */
    int updateByPrimaryKeySelective(tb_user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Thu Oct 13 10:18:29 CST 2016
     */
    int updateByPrimaryKey(tb_user record);
}