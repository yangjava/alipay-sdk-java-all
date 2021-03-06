package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务参数的KeyValue键值对
 *
 * @author auto create
 * @since 1.0, 2019-03-06 21:29:49
 */
public class BizParamKeyValue extends AlipayObject {

	private static final long serialVersionUID = 7131614785956862988L;

	/**
	 * 参数名key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 参数值value
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
