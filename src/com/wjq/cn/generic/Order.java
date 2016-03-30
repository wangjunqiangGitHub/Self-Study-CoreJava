package com.wjq.cn.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 
*  @author  wjq  
*  @ClassName  : Order  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016��2��23�� ����5:40:54
*  
*  �Զ��巺����
 */
public class Order<T> {
	private String orderName;
	private int orderId;
	private T t;
	List<T> list=new ArrayList<>();
	
	/**
	 * �ھ�̬�ķ���,static���εı���������,�Լ�try-catch���ǲ���ʹ�÷��͵�
	 */
	/*private static T t1;
	private static final T t2;
	public static void show(){
		System.out.println(t);
	}
	public void info(){
		try {
		} catch (T t) {
			// TODO: handle exception
		}
	}*/
	/**
	 * �������͵ķ���
	 * @param e
	 * @return
	 */
	public static<E> E getE(E e){
		return e;
	}
	
	/**
	 * ʵ�����鵽���ϵĸ���
	 * @param t
	 * @param list
	 * @return
	 */
	public static <T> List<T> fromArrayToList(T[] t,List<T> list){
		for (T a : t) {
			list.add(a);
		}
		return list;
	}
	
	
	
	public void add(){
		list.add(t);
	}
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "Order [orderName=" + orderName + ", orderId=" + orderId
				+ ", t=" + t + ", list=" + list + "]";
	}
	
}
/**
 * 
*  @author  wjq  
*  @ClassName  : SubOrder  
*  �̳з��ͻ��߽ӿ�ʱ����ָ�����͵�����
 */
class SubOrder extends Order<Integer>{
	
	
	
}
