package com.wjq.cn.designpatterns.filter.me;
/**
 * 
*  @author  wjq  
*  @ClassName  : FaceFilter  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年3月22日 上午11:02:54
*  过滤笑脸的过滤器
*  eg：:)------>^V^
 */
public class FaceFilter implements Filter {

	@Override
	public String doFilter(String str) {
		// TODO Auto-generated method stub
		return str.replace(":)", "^V^");
	}

}
