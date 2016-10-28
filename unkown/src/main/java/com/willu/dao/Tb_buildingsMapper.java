package com.willu.dao;

import com.willu.model.Tb_buildings;

public interface Tb_buildingsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tb_buildings record);

    int insertSelective(Tb_buildings record);

    Tb_buildings selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tb_buildings record);

    int updateByPrimaryKey(Tb_buildings record);
}