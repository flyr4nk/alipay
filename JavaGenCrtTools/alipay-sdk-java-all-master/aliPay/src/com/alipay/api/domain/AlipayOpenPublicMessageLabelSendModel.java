package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据标签组发消息接口
 *
 * @author auto create
 * @since 1.0, 2020-04-08 15:26:03
 */
public class AlipayOpenPublicMessageLabelSendModel extends AlipayObject {

	private static final long serialVersionUID = 5738921179566299353L;

	/**
	 * 根据标签圈人的过滤器
	 */
	@ApiField("filter")
	private Filter filter;

	/**
	 * 发送消息内容，支持文本消息和图文消息
	 */
	@ApiField("material")
	private Material material;

	public Filter getFilter() {
		return this.filter;
	}
	public void setFilter(Filter filter) {
		this.filter = filter;
	}

	public Material getMaterial() {
		return this.material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}

}