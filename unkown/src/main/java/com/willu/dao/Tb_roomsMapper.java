package com.willu.dao;

import com.willu.model.Tb_rooms;

public interface Tb_roomsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tb_rooms record);

    int insertSelective(Tb_rooms record);

    Tb_rooms selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tb_rooms record);

    int updateByPrimaryKey(Tb_rooms record);
}