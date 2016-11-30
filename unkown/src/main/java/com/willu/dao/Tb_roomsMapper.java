package com.willu.dao;

import java.util.List;

import com.willu.model.Tb_rooms;

public interface Tb_roomsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tb_rooms record);

    int insertSelective(Tb_rooms record);

    Tb_rooms selectByPrimaryKey(Integer id);
    
    Tb_rooms selectByRoomNumber(int buildingid,int floornumber,int roomnumber);
    
    List<Tb_rooms> selectByFloorNumber(int buildingid,int floornumber);
    
    List<Tb_rooms> selectByBuildingName(int buildingid);
    
    int updateByPrimaryKeySelective(Tb_rooms record);

    int updateByPrimaryKey(Tb_rooms record);
}