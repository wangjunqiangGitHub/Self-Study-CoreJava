package com.wjq.cn.designpatterns.filter.me;
/**
 * 
*  @author  wjq  
*  @ClassName  : FaceFilter  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016��3��22�� ����11:02:54
*  ����Ц���Ĺ�����
*  eg��:)------>^V^
 */
public class FaceFilter implements Filter {

	@Override
	public String doFilter(String str) {
		// TODO Auto-generated method stub
		return str.replace(":)", "^V^");
	}

}
