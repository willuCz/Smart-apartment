package com.willu.serviceImpl.currency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.willu.dao.Tb_buildingsMapper;
import com.willu.dao.Tb_campusMapper;
import com.willu.dao.Tb_roomsMapper;
import com.willu.model.Tb_rooms;
import com.willu.model.receive.manager.QueryModel;
import com.willu.model.receive.manager.RoomModel;

@Service("room")
public class Room implements com.willu.serviceI.currency.Room {

	@Resource
	Tb_roomsMapper tb_roomsMapper;
	Tb_campusMapper tb_campusMapper;
	Tb_buildingsMapper tb_buildingsMapper;
	private List<com.willu.model.Result.Room> list = new ArrayList<com.willu.model.Result.Room>();
	@Override
	public List<com.willu.model.Result.Room> SelectRoom(QueryModel queryModel) {
		
		return list;
	}

	@Override
	public String AddRoom(RoomModel roomModel) {
		String result = null ;
		return result;
	}

	@Override
	public String UpdateRoom(RoomModel roomModel) {
		String result = null ;
		return result;
	}

	@Override
	public String DeleteRoom(RoomModel roomModel) {
		String result = null ;
		return result;
	}

}
