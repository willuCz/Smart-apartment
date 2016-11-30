package com.willu.dao;

import java.util.List;

import com.willu.model.Tb_buildings;

public interface Tb_buildingsMapper {
    int deleteByPrimaryKey(Integer id);
    
    int deleteByName(String name);

    int insert(Tb_buildings record);

    int insertSelective(Tb_buildings record);

    Tb_buildings selectByPrimaryKey(Integer id);
    
    List<Tb_buildings> selectByName(String name);
    
    List<Tb_buildings> selectByCampusId(int campusId);
    
    Tb_buildings selectByTwo(int campusId,String BuildingName);

    int updateByPrimaryKeySelective(Tb_buildings record);

    int updateByPrimaryKey(Tb_buildings record);
}