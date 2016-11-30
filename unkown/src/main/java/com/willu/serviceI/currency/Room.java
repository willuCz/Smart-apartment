package com.willu.serviceI.currency;

import java.util.List;
import com.willu.model.receive.manager.QueryModel;
import com.willu.model.receive.manager.RoomModel;

public interface Room {
	
	public List<com.willu.model.Result.Room> SelectRoom(QueryModel queryModel);
	
	public String AddRoom(RoomModel roomModel);
	
	public String UpdateRoom(RoomModel roomModel);
	
	public String DeleteRoom(RoomModel roomModel);
	
	
}
