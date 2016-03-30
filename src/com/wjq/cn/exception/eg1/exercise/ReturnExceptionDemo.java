package com.wjq.cn.exception.eg1.exercise;

public class ReturnExceptionDemo {
	
	static void A(){
		try {
			System.out.println("进入方法A");
			throw new RuntimeException("方法A制造异常");
		}finally{
			System.out.println("执行方法A的finally");
		}
	}
	
	static int B(){
		try {
			System.out.println("进入方法B");
			return 1;
		}finally{
			System.out.println("方法B的finally");
			return 2;
		}
	}
	
	
	public static void main(String[] args) {
		
		try {
			A();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		B();
	}

}
