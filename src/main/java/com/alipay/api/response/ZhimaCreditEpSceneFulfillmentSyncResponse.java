package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.scene.fulfillment.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-04 15:50:00
 */
public class ZhimaCreditEpSceneFulfillmentSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7169742284238935291L;

	/** 
	 * 履约单号
	 */
	@ApiField("fulfillment_order_no")
	private String fulfillmentOrderNo;

	public void setFulfillmentOrderNo(String fulfillmentOrderNo) {
		this.fulfillmentOrderNo = fulfillmentOrderNo;
	}
	public String getFulfillmentOrderNo( ) {
		return this.fulfillmentOrderNo;
	}

}
