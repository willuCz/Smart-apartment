package com.willu.serviceI.currency;

public interface Floor {
	
	public String SelectFloor(String buildingName);
	
	public String AddFloor(int floorNum,String buildingName);
	
	public String UpdateFloor(String floorNum);
	
	public String DeleteFloor(String floorNum);
}
