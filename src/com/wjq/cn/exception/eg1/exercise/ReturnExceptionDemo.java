package com.wjq.cn.exception.eg1.exercise;

public class ReturnExceptionDemo {
	
	static void A(){
		try {
			System.out.println("���뷽��A");
			throw new RuntimeException("����A�����쳣");
		}finally{
			System.out.println("ִ�з���A��finally");
		}
	}
	
	static int B(){
		try {
			System.out.println("���뷽��B");
			return 1;
		}finally{
			System.out.println("����B��finally");
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
