package com.willu.dao;

import java.util.List;

import com.willu.model.Tb_bed;

public interface Tb_bedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tb_bed record);

    int insertSelective(Tb_bed record);

    Tb_bed selectByPrimaryKey(Integer id);
    
    Tb_bed selectByBedNumber(Integer roomid,Integer bednumber);
    
    List<Tb_bed> selectByRoomId(Integer roomid);

    int updateByPrimaryKeySelective(Tb_bed record);

    int updateByPrimaryKey(Tb_bed record);
}