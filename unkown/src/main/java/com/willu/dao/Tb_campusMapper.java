package com.willu.dao;

import com.willu.model.Tb_campus;

public interface Tb_campusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tb_campus record);

    int insertSelective(Tb_campus record);

    Tb_campus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tb_campus record);

    int updateByPrimaryKey(Tb_campus record);
}