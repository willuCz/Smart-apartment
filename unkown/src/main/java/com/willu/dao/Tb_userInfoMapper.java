package com.willu.dao;

import com.willu.model.Tb_userInfo;

public interface Tb_userInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tb_userInfo record);

    int insertSelective(Tb_userInfo record);

    Tb_userInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tb_userInfo record);

    int updateByPrimaryKey(Tb_userInfo record);
}