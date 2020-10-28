package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 下单请求接口
 *
 * @author auto create
 * @since 1.0, 2019-12-31 12:12:06
 */
public class AlipayInsAutoAutoinsprodPolicyApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3815978783639535258L;

	/**
	 * 商业险收款账号，商交保费收入账号不一致时，商业险收入账号传此字段。一般为保险公司收款账号登录ID，最终以技术isv给出示例为准，蚂蚁会校验该id对应的保险公司是不是和蚂蚁胜信签约以及签约关系是否有效，示例：xxxx.@alipay.com
	 */
	@ApiField("bus_income_account_no")
	private String busIncomeAccountNo;

	/**
	 * 邮寄信息
	 */
	@ApiField("deliver_info")
	private DeliverInfo deliverInfo;

	/**
	 * 询价申请ID
	 */
	@ApiField("enquiry_biz_id")
	private String enquiryBizId;

	/**
	 * 交强险收款账号，商交保费收入账号不一致时，交强险收入账号传此字段。一般为保险公司收款账号登录ID，最终以技术isv给出示例为准，蚂蚁会校验该id对应的保险公司是不是和蚂蚁胜信签约以及签约关系是否有效，示例：xxxx.@alipay.com
	 */
	@ApiField("force_income_account_no")
	private String forceIncomeAccountNo;

	/**
	 * 指定保险公司支付宝收款账户,一般为保险公司收款账号登录ID
	 */
	@ApiField("income_account_no")
	private String incomeAccountNo;

	/**
	 * 报价ID
	 */
	@ApiField("quote_biz_id")
	private String quoteBizId;

	/**
	 * 付费方式,1-代理人付款，2-投保人付款
	 */
	@ApiField("who_payed")
	private String whoPayed;

	public String getBusIncomeAccountNo() {
		return this.busIncomeAccountNo;
	}
	public void setBusIncomeAccountNo(String busIncomeAccountNo) {
		this.busIncomeAccountNo = busIncomeAccountNo;
	}

	public DeliverInfo getDeliverInfo() {
		return this.deliverInfo;
	}
	public void setDeliverInfo(DeliverInfo deliverInfo) {
		this.deliverInfo = deliverInfo;
	}

	public String getEnquiryBizId() {
		return this.enquiryBizId;
	}
	public void setEnquiryBizId(String enquiryBizId) {
		this.enquiryBizId = enquiryBizId;
	}

	public String getForceIncomeAccountNo() {
		return this.forceIncomeAccountNo;
	}
	public void setForceIncomeAccountNo(String forceIncomeAccountNo) {
		this.forceIncomeAccountNo = forceIncomeAccountNo;
	}

	public String getIncomeAccountNo() {
		return this.incomeAccountNo;
	}
	public void setIncomeAccountNo(String incomeAccountNo) {
		this.incomeAccountNo = incomeAccountNo;
	}

	public String getQuoteBizId() {
		return this.quoteBizId;
	}
	public void setQuoteBizId(String quoteBizId) {
		this.quoteBizId = quoteBizId;
	}

	public String getWhoPayed() {
		return this.whoPayed;
	}
	public void setWhoPayed(String whoPayed) {
		this.whoPayed = whoPayed;
	}

}