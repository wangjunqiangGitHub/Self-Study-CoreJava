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
*  @date  2016年2月23日 下午5:40:54
*  
*  自定义泛型类
 */
public class Order<T> {
	private String orderName;
	private int orderId;
	private T t;
	List<T> list=new ArrayList<>();
	
	/**
	 * 在静态的方法,static修饰的变量，常量,以及try-catch中是不能使用泛型的
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
	 * 声明泛型的方法
	 * @param e
	 * @return
	 */
	public static<E> E getE(E e){
		return e;
	}
	
	/**
	 * 实现数组到集合的复制
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
*  继承泛型或者接口时可以指明泛型的类型
 */
class SubOrder extends Order<Integer>{
	
	
	
}
