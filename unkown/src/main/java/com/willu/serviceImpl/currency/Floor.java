package com.willu.serviceImpl.currency;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.willu.dao.Tb_buildingsMapper;
import com.willu.model.Tb_buildings;

@Service("floor")
public class Floor implements com.willu.serviceI.currency.Floor {

	@Resource
	Tb_buildingsMapper tb_buildingsMapper;
	@Override
	public String SelectFloor(String buildingName) {
		String result = null;
		return result;
	}

	@Override
	public String AddFloor(int floorNum,String buildingName) {
		String result = null ;
		return result;
	}

	@Override
	public String UpdateFloor(String floorNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String DeleteFloor(String floorNum) {
		// TODO Auto-generated method stub
		return null;
	}

}
