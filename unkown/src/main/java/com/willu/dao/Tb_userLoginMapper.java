package com.willu.dao;

import com.willu.model.Tb_userLogin;

public interface Tb_userLoginMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tb_userLogin record);

    int insertSelective(Tb_userLogin record);

    Tb_userLogin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tb_userLogin record);

    int updateByPrimaryKey(Tb_userLogin record);
}