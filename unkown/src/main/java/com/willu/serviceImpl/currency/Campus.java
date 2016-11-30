package com.willu.serviceImpl.currency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.willu.dao.Tb_campusMapper;
import com.willu.model.Tb_campus;
import com.willu.model.Result.Manager.ResultCampusModel;
import com.willu.model.receive.manager.CampusModel;

@Service("campus")
public class Campus implements com.willu.serviceI.currency.Campus {
	
	@Resource
	Tb_campusMapper tb_campusMapper;
	private List<ResultCampusModel> list = new ArrayList<ResultCampusModel>();	
	@Override
	public List<ResultCampusModel> SelectCampus() {
		List<Tb_campus> campuslist;
		campuslist =  tb_campusMapper.selectAll();
		Iterator<Tb_campus> iter = campuslist.iterator();
		while(iter.hasNext()){
			Tb_campus tb_campus = iter.next();
			ResultCampusModel campus = new ResultCampusModel();
			campus.setCampusCode(tb_campus.getCode());
			campus.setCampusName(tb_campus.getName());
			campus.setRemark(tb_campus.getRemark());
			list.add(campus);
		}
		return list;
	}

	@Override
	public String AddCampus(CampusModel campusModel) {
		String result = null;
		Tb_campus tb_campus = new Tb_campus();
		tb_campus.setCode(campusModel.getCode());
		tb_campus.setName(campusModel.getName());
		tb_campus.setRemark(campusModel.getRemark());
		int i = tb_campusMapper.insert(tb_campus);
		if(i==1){
			result = "1";
		}
		else{
			result = "128101";
		}
		return result;
	}

	@Override
	public String UpdateCampus(CampusModel campusModel,String campusName) {
		String result = null;
		Tb_campus tb_campus = new Tb_campus();
		tb_campus = tb_campusMapper.selectByName(campusName);
		if(campusModel.getCode()!=null){
			tb_campus.setCode(campusModel.getCode());
		}
		if(campusModel.getName()!=null){
			tb_campus.setName(campusModel.getName());
		}
		if(campusModel.getRemark()!=null){
			tb_campus.setRemark(campusModel.getRemark());
		}
		int i= tb_campusMapper.updateByPrimaryKey(tb_campus);
		if(i==1){
			result = "1";
		}
		else {
			result = "128102";
		}
		return result;
	}

	@Override
	public String DeleteCampus(String campusname) {
		String result = null;
		int i =  tb_campusMapper.deleteByName(campusname);
		if(i==1){
			result = "1";
		}
		else{
			result = "128103";
		}
		return result;
	}

}
