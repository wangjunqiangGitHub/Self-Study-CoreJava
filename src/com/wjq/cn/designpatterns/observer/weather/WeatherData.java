package com.wjq.cn.designpatterns.observer.weather;

import java.util.ArrayList;

public class WeatherData implements Subject{
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private  float pressure;
	public WeatherData() {
		observers=new ArrayList();
	}
	
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int indexOf = observers.indexOf(observer);
		if(indexOf>=0){
			observers.remove(indexOf);
		}
	}

	@Override
	public void notifyObserver() {
		for (Object o : observers) {
			Observer observer=(Observer) o;
			observer.update(temperature, humidity, pressure);
		}
	}
	
	
	//��������վ�õ���ֵ��ʱ�����Ǿ���Ҫ���ô˷���
	public void measurementsChanged(){
		notifyObserver();
	}
	
	
	public void set(float temp,float humidity,float pressure){
		this.temperature=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();
	}
	
	
	
	
	
	
	
	
	
	

}
