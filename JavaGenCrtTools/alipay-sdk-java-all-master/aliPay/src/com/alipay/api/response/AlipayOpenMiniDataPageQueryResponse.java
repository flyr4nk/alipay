package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PageVisitDataResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.data.page.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-20 16:57:40
 */
public class AlipayOpenMiniDataPageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5386575565119452319L;

	/** 
	 * 页面访问数据结果
	 */
	@ApiListField("page_visit_data_list_response")
	@ApiField("page_visit_data_response")
	private List<PageVisitDataResponse> pageVisitDataListResponse;

	public void setPageVisitDataListResponse(List<PageVisitDataResponse> pageVisitDataListResponse) {
		this.pageVisitDataListResponse = pageVisitDataListResponse;
	}
	public List<PageVisitDataResponse> getPageVisitDataListResponse( ) {
		return this.pageVisitDataListResponse;
	}

}