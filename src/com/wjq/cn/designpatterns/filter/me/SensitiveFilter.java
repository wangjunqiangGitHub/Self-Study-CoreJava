package com.wjq.cn.designpatterns.filter.me;
/**
 * 
*  @author  wjq  
*  @ClassName  : SensitiveFilter  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年3月22日 上午11:15:44
*  过滤掉一些敏感的词汇
*  
*  eg:  敏感--------""
*  		被就业------"就业"
*  
 */
public class SensitiveFilter implements Filter {

	@Override
	public String doFilter(String str) {
		// TODO Auto-generated method stub
		return str.replace("敏感", "").replace("被就业", "就业");
	}

}
