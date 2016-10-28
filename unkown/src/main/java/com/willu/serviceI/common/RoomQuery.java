package com.willu.serviceI.common;

import com.willu.model.Result.SurplusBedQueryResultModel;
import com.willu.model.Result.XSCWQueryResultModel;
import com.willu.model.Result.ZSFPQueryResultModel;
import com.willu.model.receive.SurplusBedQueryModel;
import com.willu.model.receive.XSCWQueryModel;
import com.willu.model.receive.ZSFPQueryModel;

/**
 * 寝室查询接口类
 * @author 赵维禄M
 *
 */
public interface RoomQuery {
	/**
	 * 剩余床位查询
	 * @param surplusBedQueryModel
	 * @return
	 */
	public SurplusBedQueryResultModel SYCWQuery(SurplusBedQueryModel surplusBedQueryModel);
	
	/**
	 * 住宿分配查询
	 * @param zsfpQueryModel
	 * @return
	 */
	public ZSFPQueryResultModel ZSFPQuery(ZSFPQueryModel zsfpQueryModel);
	
	/**
	 * 学生床位查询
	 * @param xscwQueryModel
	 * @return
	 */
	public XSCWQueryResultModel XSCWQuery(XSCWQueryModel xscwQueryModel);
}
