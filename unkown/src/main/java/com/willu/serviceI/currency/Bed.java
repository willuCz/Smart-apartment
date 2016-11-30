package com.willu.serviceI.currency;

import java.util.List;
import com.willu.model.receive.manager.BedModel;
import com.willu.model.receive.manager.QueryModel;
import com.willu.model.receive.manager.RoomModel;

public interface Bed {
	
	public List<com.willu.model.Result.Bed> selectBed(QueryModel queryModel);
	
	public String AddBed(BedModel bedModel);
	
	public String UpdateBed(BedModel bedModel);
	
	public String DeleteRoom(RoomModel roomModel);
}
