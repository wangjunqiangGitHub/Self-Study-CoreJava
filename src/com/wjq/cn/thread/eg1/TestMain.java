package com.wjq.cn.thread.eg1;
/**
 * 
*  @author  wjq  
*  @ClassName  : TestMain  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016��3��7�� ����5:09:31
*  //���̣߳����߳�
 */
public class TestMain {
	public static void main(String[] args) {
		method2("wjq");
	}
	
	public static void method1(String str){
		System.out.println("method1..");
		
	} 
	
	public static void method2(String str){
		System.out.println("mehod2...");
		method1(str);
	}
	

}
