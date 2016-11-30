package com.willu.serviceImpl.currency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.willu.dao.Tb_buildingsMapper;
import com.willu.dao.Tb_campusMapper;
import com.willu.model.Tb_buildings;
import com.willu.model.Result.Manager.ResultBuildingModel;
import com.willu.model.receive.manager.BuildingModel;

@Service("building")
public class Building implements com.willu.serviceI.currency.Building {

	@Resource
	Tb_buildingsMapper tb_buildingsMapper;
	@Resource
	Tb_campusMapper tb_campusMapper;
	private List<ResultBuildingModel> list = new ArrayList<ResultBuildingModel>();
	@Override
	public List<ResultBuildingModel> SelectBuildingByCampusName(String campusName) {
		List<Tb_buildings> tb_buildingslist = tb_buildingsMapper.selectByCampusId(tb_campusMapper.selectByName(campusName).getId());
		Iterator<Tb_buildings> iterator = tb_buildingslist.iterator();
		while(iterator.hasNext()){
			Tb_buildings tb_buildings = iterator.next();
			ResultBuildingModel building = new ResultBuildingModel();
			building.setCampusName(campusName);
			building.setBuildingName(tb_buildings.getName());
			building .setBuildingType(tb_buildings.getType());
			building.setFloor(tb_buildings.getFloors());
			list.add(building);
		}
		return list;
	}
	
	@Override
	public List<ResultBuildingModel> SelectBuildingByBuildingName(String buildingName){
			List<Tb_buildings> tb_buildingslist = tb_buildingsMapper.selectByName(buildingName);
			Iterator<Tb_buildings> iterator = tb_buildingslist.iterator();
			while(iterator.hasNext()){
				Tb_buildings tb_buildings = iterator.next();
				ResultBuildingModel building = new ResultBuildingModel();
				building.setCampusName(tb_buildingsMapper.selectByPrimaryKey(tb_buildings.getCampusid()).getName());
				building.setBuildingName(tb_buildings.getName());
				building .setBuildingType(tb_buildings.getType());
				building.setFloor(tb_buildings.getFloors());
				list.add(building);
			}
			return list;
			
	}
	
	@Override
	public ResultBuildingModel SelectBuildingByTwo(String campusName,String buildingName){
		Tb_buildings  tb_buildings  = tb_buildingsMapper.selectByTwo(tb_campusMapper.selectByName(campusName).getId(),buildingName);
		ResultBuildingModel buildingModel = new ResultBuildingModel();
		buildingModel.setCampusName(campusName);
		buildingModel.setBuildingName(tb_buildings.getName());
		buildingModel.setBuildingType(tb_buildings.getType());
		buildingModel.setFloor(tb_buildings.getFloors());
		return buildingModel;
	}
	
	@Override
	public String AddBuilding(BuildingModel buildingModel) {
		String result = null ;
		Tb_buildings tb_buildings = new Tb_buildings();
		tb_buildings.setCampusid(tb_campusMapper.selectByName(buildingModel.getCampusName()).getId());
		tb_buildings.setFloors(buildingModel.getFloors());
		tb_buildings.setName(buildingModel.getName());
		tb_buildings.setType(buildingModel.getType());
		int i = tb_buildingsMapper.insert(tb_buildings);
		if(i==1){
			result = "1";
		}
		else{
			result ="128201";
		}
		return result;
	}

	@Override
	public String UpdateBuilding(BuildingModel buildingModel,String buildingName) {
		String result = null;
		Tb_buildings tb_buildings = new Tb_buildings();
		tb_buildings = (Tb_buildings) tb_buildingsMapper.selectByName(buildingName);
		if(buildingModel!=null){
			if(buildingModel.getCampusName()!=null){
				tb_buildings.setCampusid(tb_campusMapper.selectByName(buildingModel.getCampusName()).getId());
			}
			if(buildingModel.getName()!=null){
				tb_buildings.setName(buildingModel.getName());
			}
			if(buildingModel!=null){
				tb_buildings.setType(buildingModel.getType());
			}
			if(buildingModel!=null){
				tb_buildings.setFloors(buildingModel.getFloors());
			}
			int i = tb_buildingsMapper.updateByPrimaryKey(tb_buildings);
			if(i==1){
				result = "1"; 
			}
			else{
				result = "128000";
			}
		}
		else{
			result = "128000";
		}
		return result;
	}

	@Override
	public String DeleteBuilding(String buildingName) {
		String result = null ;
		int i = tb_buildingsMapper.deleteByName(buildingName);
		if(i==1){
			result = "1";
		}
		else{
			result = "128000";
		}
		return result;
	}

}
