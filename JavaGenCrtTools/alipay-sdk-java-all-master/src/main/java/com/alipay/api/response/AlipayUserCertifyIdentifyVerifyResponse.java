package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.identify.verify response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-08 10:46:32
 */
public class AlipayUserCertifyIdentifyVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4672896253194496143L;

	/** 
	 * 校验结果，T表示满足条件，F表示不满足条件
	 */
	@ApiField("biz_code_status")
	private String bizCodeStatus;

	public void setBizCodeStatus(String bizCodeStatus) {
		this.bizCodeStatus = bizCodeStatus;
	}
	public String getBizCodeStatus( ) {
		return this.bizCodeStatus;
	}

}