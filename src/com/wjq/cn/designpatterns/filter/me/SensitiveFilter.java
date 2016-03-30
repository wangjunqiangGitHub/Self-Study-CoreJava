package com.wjq.cn.designpatterns.filter.me;
/**
 * 
*  @author  wjq  
*  @ClassName  : SensitiveFilter  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016��3��22�� ����11:15:44
*  ���˵�һЩ���еĴʻ�
*  
*  eg:  ����--------""
*  		����ҵ------"��ҵ"
*  
 */
public class SensitiveFilter implements Filter {

	@Override
	public String doFilter(String str) {
		// TODO Auto-generated method stub
		return str.replace("����", "").replace("����ҵ", "��ҵ");
	}

}
