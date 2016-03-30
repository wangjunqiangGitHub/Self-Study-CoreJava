package com.wjq.cn.designpatterns.observer.weather;
/**
 * 
*  @author  wjq  
*  @ClassName  : Observer  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年3月14日 下午1:45:24
*  观察者的接口,
 */
public interface Observer {
	//当主题的数据发生变更时调用此方法
	public void update(float temp,float humidity,float pressure);
	
}
