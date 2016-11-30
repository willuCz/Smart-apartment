package com.willu.serviceI.manager;

import java.util.List;

import com.willu.model.Result.Bed;
import com.willu.model.Result.Building;
import com.willu.model.Result.Room;
import com.willu.model.Result.Manager.ResultCampusModel;
import com.willu.model.receive.manager.BedModel;
import com.willu.model.receive.manager.BuildingModel;
import com.willu.model.receive.manager.CampusModel;
import com.willu.model.receive.manager.QueryModel;
import com.willu.model.receive.manager.RoomModel;

public interface Manager {
	
	public List<ResultCampusModel> SelectCampus();
	
	public String AddCampus(CampusModel campusModel);
	
	public String UpdateCampus(CampusModel campusModel);
	
	public String DeleteCcampus(String campusname);
	
	public List<Building> SelectBuilding(String campusname);
	
	public String AddBuilding(BuildingModel buildingModel);
	
	public String UpdateBuilding(BuildingModel buildingModel);
	
	public String DeleteBuilding(String buildingName);
	
	public String SelectFloor(String buildingName);
	
	public String AddFloor(String floorNum);
	
	public String UpdateFloor(String floorNum);
	
	public String DeleteFloor(String floorNum);
	
	public List<Room> SelectRoom(QueryModel queryModel);
	
	public String AddRoom(RoomModel roomModel);
	
	public String UpdateRoom(RoomModel roomModel);

	public String DeleteRoom(RoomModel roomModel);
	
	public List<Bed> selectBed(QueryModel queryModel);
	
	public String AddBed(BedModel bedModel);
	
	public String UpdateBed(BedModel bedModel);
	
	public String DeteleBed(BedModel bedModel);
}
