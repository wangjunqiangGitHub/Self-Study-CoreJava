package com.wjq.cn.designpatterns.filter.web;
/**
 * 
*  @author  wjq  
*  @ClassName  : Filter  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*
 */
public interface Filter {
	/**
	 * �Զ��������
	 * @param request
	 * @param response
	 * @param filterChain
	 */
	void doFilter(Request request,Response response,FilterChain filterChain);

}
