package com.willu.model.Result;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Campus {
	private String campuscode;
	private String campusname;
	
	public String getCampusCode(){
		return campuscode;
	}
	
	public void setCampusCode(String campuscode){
		this.campuscode = campuscode == null ? null : campuscode.intern();
	}
	
	public String getCampusName(){
		return campusname;
	}
	
	public void setCampusName(String campusname){
		this.campusname = campusname ==null ? null : campusname.intern();
	}
}
