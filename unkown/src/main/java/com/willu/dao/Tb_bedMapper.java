package com.willu.dao;

import com.willu.model.Tb_bed;

public interface Tb_bedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tb_bed record);

    int insertSelective(Tb_bed record);

    Tb_bed selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tb_bed record);

    int updateByPrimaryKey(Tb_bed record);
}