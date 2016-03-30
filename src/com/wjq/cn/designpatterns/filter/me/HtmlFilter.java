package com.wjq.cn.designpatterns.filter.me;
/**
 * 
*  @author  wjq  
*  @ClassName  : HtmlFilter  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016��3��22�� ����11:12:54
*  �������������html��ǩ��Filter
*  eg:   <-----��[
*  		 >-----]
 */
public class HtmlFilter implements Filter  {

	@Override
	public String doFilter(String str) {
		// TODO Auto-generated method stub
		return str.replace("<", "[").replace(">", "]");
	}

}
