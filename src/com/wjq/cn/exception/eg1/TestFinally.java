package com.wjq.cn.exception.eg1;


public class TestFinally {
	
	
	public static void main(String[] args) {
		int i=method();
		System.out.println(i);
	}
	
	 
	public static int   method(){
		try {
			int i=10/0;
			return 0;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("�����ˣ�");
			throw new RuntimeException("�����ˣ���");
		//	return 1;
		}catch (Exception e) {
			// TODO: handle exception
			
			return 2;
		}finally{
			System.out.println("������������");
			//return 3;
			throw new RuntimeException("AAA�����ˣ���");
		}
	}
	
	
	

}
