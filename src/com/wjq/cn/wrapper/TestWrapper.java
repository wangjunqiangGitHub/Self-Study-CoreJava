package com.wjq.cn.wrapper;

import org.junit.Test;

/**
 * 
*  @author  wjq  
*  @ClassName  : TestWrapper  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年2月22日 下午2:58:12
*  测试基础数据类型的包装类的装箱和自动拆箱以及和字符串之间的转换
*  
 */
public class TestWrapper {
	/**
	 * 包装类型和字符串之间的转换
	 */
	@Test
	public void test2(){
		
		int i1=10;
		String str1=i1+"";
		Integer i2=i1;
		String str2 = String.valueOf(i2);
		System.out.println(i2);
		
		
	}
	
	
	
	
	/**
	 * 基本数据类型和包装类之间的转换
	 */
	@Test
	public void test1(){
		
		Boolean b1=new Boolean(true);
		Boolean b2=new Boolean("true");
		Boolean b3=new Boolean("flase");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		//要特别注意boolean,除了字符串true以外其余的转换都将返回false
		Boolean b4=new Boolean("123");
		System.out.println(b4);//false
		
		
		/**
		 * 1.基本数据类型转包装
		 * 		❶包装类型的构造器
		 * 		❷包装类型.valueOf()
		 */
		Integer i1 = Integer.valueOf(1);
		Integer i2=new Integer(1);
		System.out.println(i1.toString());
		System.out.println(i2.toString());
		
		Float f1=new Float(12.0);
		Float f2=new Float("12.0");
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		
		Order order=new Order();
		System.out.println(order.b);
		System.out.println(order.b1);
		
		//自jdk1.5之后自动装箱自动拆箱
		int i5=10;
		//自动装箱,可以调用Integer类的方法
		Integer i6=i5;
		System.out.println(i6.getClass());
		//自动拆箱
		int i7=i6;
		System.out.println(i7);
		
		
		
	}
	

}

class Order{
	Boolean b;
	boolean b1;
}
