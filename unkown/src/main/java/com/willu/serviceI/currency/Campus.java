package com.willu.serviceI.currency;

import java.util.List;
import com.willu.model.Result.Manager.ResultCampusModel;
import com.willu.model.receive.manager.CampusModel;

public interface Campus {
	
	public List<ResultCampusModel> SelectCampus();
	
	public String AddCampus(CampusModel campusModel);
	
	public String UpdateCampus(CampusModel campusModel,String campusName);
	
	public String DeleteCampus(String campusName);
}
