package com.willu.serviceImpl.currency;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.willu.dao.Tb_bedMapper;
import com.willu.dao.Tb_buildingsMapper;
import com.willu.dao.Tb_campusMapper;
import com.willu.dao.Tb_roomsMapper;
import com.willu.model.Tb_bed;
import com.willu.model.Tb_buildings;
import com.willu.model.Tb_rooms;
import com.willu.model.receive.manager.BedModel;
import com.willu.model.receive.manager.QueryModel;
import com.willu.model.receive.manager.RoomModel;

@Service("bed")
public class Bed implements com.willu.serviceI.currency.Bed {

	@Resource
	Tb_bedMapper tb_bedMapper;
	Tb_roomsMapper tb_roomsMapper;
	Tb_campusMapper tb_campusMapper;
	Tb_buildingsMapper tb_buildingsMapper;
	private List<com.willu.model.Result.Bed> bedlist;
	@Override
	public List<com.willu.model.Result.Bed> selectBed(QueryModel queryModel) {
		
		return null;
	}

	@Override
	public String AddBed(BedModel bedModel) {
		// 
		return null;
	}

	@Override
	public String UpdateBed(BedModel bedModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String DeleteRoom(RoomModel roomModel) {
		// TODO Auto-generated method stub
		return null;
	}

}
