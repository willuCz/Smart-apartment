package com.willu.serviceImpl.manager;
import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.willu.dao.Tb_roomsMapper;
import com.willu.model.Result.Bed;
import com.willu.model.Result.Building;
import com.willu.model.Result.Room;
import com.willu.model.Result.Manager.ResultCampusModel;
import com.willu.model.receive.manager.BedModel;
import com.willu.model.receive.manager.BuildingModel;
import com.willu.model.receive.manager.CampusModel;
import com.willu.model.receive.manager.QueryModel;
import com.willu.model.receive.manager.RoomModel;




@Service("manager")
public class Manager implements com.willu.serviceI.manager.Manager {

	@Resource(name = "campus")
	private com.willu.serviceImpl.currency.Campus campus;
	@Override
	public List<ResultCampusModel> SelectCampus() {
		List<ResultCampusModel> list = campus.SelectCampus();
		return list;
	}

	@Override
	public String AddCampus(CampusModel campusModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String UpdateCampus(CampusModel campusModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String DeleteCcampus(String campusname) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Resource(name="building")
	private com.willu.serviceImpl.currency.Building building;
	@Override
	public List<Building> SelectBuilding(String campusname) {
		//List<Building> list = building.SelectBuildingByCampusName(campusname);
		return null;
	}
	
	@Override
	public String AddBuilding(BuildingModel buildingModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String UpdateBuilding(BuildingModel buildingModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String DeleteBuilding(String buildingName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String SelectFloor(String buildingName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String AddFloor(String floorNum) {
		// TODO Auto-generated method stub
		return null;
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
	
	@Resource
	private Tb_roomsMapper tb_roomsMapper;
	@Override
	public List<Room> SelectRoom(QueryModel queryModel) {
		
		return null;
	}

	@Override
	public String AddRoom(RoomModel roomModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String UpdateRoom(RoomModel roomModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String DeleteRoom(RoomModel roomModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bed> selectBed(QueryModel queryModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String AddBed(BedModel bedModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String UpdateBed(BedModel bedModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String DeteleBed(BedModel bedModel) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
