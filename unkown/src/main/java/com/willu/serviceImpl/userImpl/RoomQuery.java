package com.willu.serviceImpl.userImpl;

import com.willu.model.Result.SurplusBedQueryResultModel;
import com.willu.model.Result.XSCWQueryResultModel;
import com.willu.model.Result.ZSFPQueryResultModel;
import com.willu.model.receive.SurplusBedQueryModel;
import com.willu.model.receive.XSCWQueryModel;
import com.willu.model.receive.ZSFPQueryModel;

public class RoomQuery implements com.willu.serviceI.common.RoomQuery {
	@Override
	public SurplusBedQueryResultModel SYCWQuery(SurplusBedQueryModel surplusBedQueryModel) {
		SurplusBedQueryResultModel surplusBedQueryResultModel = new SurplusBedQueryResultModel();
		
		return surplusBedQueryResultModel;
	}

	@Override
	public ZSFPQueryResultModel ZSFPQuery(ZSFPQueryModel zsfpQueryModel) {
		ZSFPQueryResultModel zsfpQueryResultModel = new ZSFPQueryResultModel();
		return zsfpQueryResultModel;
	}

	@Override
	public XSCWQueryResultModel XSCWQuery(XSCWQueryModel xscwQueryModel) {
		XSCWQueryResultModel xscwQueryResultModel = new XSCWQueryResultModel();
		return xscwQueryResultModel;
	}
}
