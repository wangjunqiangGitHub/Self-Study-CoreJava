package com.wjq.cn.designpatterns.filter.me;
/**
 * 
*  @author  wjq  
*  @ClassName  : HtmlFilter  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年3月22日 上午11:12:54
*  这个是用来过滤html标签的Filter
*  eg:   <-----》[
*  		 >-----]
 */
public class HtmlFilter implements Filter  {

	@Override
	public String doFilter(String str) {
		// TODO Auto-generated method stub
		return str.replace("<", "[").replace(">", "]");
	}

}
