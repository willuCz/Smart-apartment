package com.willu.model.Result;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 页数model
 * @author 赵维禄M
 *
 */
@XmlRootElement
public class PageModel {
	public int inPage;
	public int allPage;
	
	public int getInPageInfo(){
		return inPage;
	}
	public void setInPageInfo(int inPage){
		this.inPage=inPage;
	}
	
	public int getAllPageInfo(){
		return allPage;
	}
	public void setAllPageInfo(int allPage){
		this.allPage=allPage;
	}
}
