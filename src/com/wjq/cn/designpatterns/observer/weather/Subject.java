package com.wjq.cn.designpatterns.observer.weather;
/**
 * 
*  @author  wjq  
*  @ClassName  : Subject  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年3月14日 下午1:43:14
*  定义抽象的主题
 */
public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObserver();

}
