package com.wjq.cn.designpatterns.observer.weather;
/**
 * 
*  @author  wjq  
*  @ClassName  : Observer  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016��3��14�� ����1:45:24
*  �۲��ߵĽӿ�,
 */
public interface Observer {
	//����������ݷ������ʱ���ô˷���
	public void update(float temp,float humidity,float pressure);
	
}
