package com.wjq.cn.designpatterns.observer.weather;
/**
 * 
*  @author  wjq  
*  @ClassName  : Subject  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016��3��14�� ����1:43:14
*  ������������
 */
public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObserver();

}
