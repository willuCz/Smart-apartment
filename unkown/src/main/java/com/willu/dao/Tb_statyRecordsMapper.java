package com.willu.dao;

import com.willu.model.Tb_statyRecords;

public interface Tb_statyRecordsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tb_statyRecords record);

    int insertSelective(Tb_statyRecords record);

    Tb_statyRecords selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tb_statyRecords record);

    int updateByPrimaryKey(Tb_statyRecords record);
}