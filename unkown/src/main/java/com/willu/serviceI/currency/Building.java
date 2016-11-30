package com.willu.serviceI.currency;


import java.util.List;

import com.willu.model.Result.Manager.ResultBuildingModel;
import com.willu.model.receive.manager.BuildingModel;

public interface Building {
	
	public List<ResultBuildingModel> SelectBuildingByCampusName(String campusName);
	
	public List<ResultBuildingModel> SelectBuildingByBuildingName(String buildingName);
	
	public ResultBuildingModel SelectBuildingByTwo(String campusName,String buildingName);
	
	public String AddBuilding(BuildingModel buildingModel);
	
	public String UpdateBuilding(BuildingModel buildingModel,String buildingName);
	
	public String DeleteBuilding(String buildingName);
}
