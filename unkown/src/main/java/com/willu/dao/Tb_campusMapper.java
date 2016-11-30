package com.willu.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.willu.model.Tb_campus;

@Repository
public interface Tb_campusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tb_campus record);

    int insertSelective(Tb_campus record);

    Tb_campus selectByPrimaryKey(Integer id);
    
    List<Tb_campus> selectAll();
    
    Tb_campus selectByName(String name);
   
    int deleteByName(String name);
    
    int updateByPrimaryKeySelective(Tb_campus record);

    int updateByPrimaryKey(Tb_campus record);
}