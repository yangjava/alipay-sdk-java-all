package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BizListDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.prodmode.chargeoffinst.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-04-26 13:55:09
 */
public class AlipayEbppProdmodeChargeoffinstQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5853141935577638231L;

	/** 
	 * 销账机构下拉列表
	 */
	@ApiListField("data_list")
	@ApiField("biz_list_data_info")
	private List<BizListDataInfo> dataList;

	public void setDataList(List<BizListDataInfo> dataList) {
		this.dataList = dataList;
	}
	public List<BizListDataInfo> getDataList( ) {
		return this.dataList;
	}

}