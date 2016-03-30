package com.wjq.cn.extend.eg1;

public class TestCircle {
	
	public static void main(String[] args) {
		Circle c1=new Circle(1.2);
		Circle c2=new Circle(1.3);
		System.out.println(c1.equals(c2));
		System.out.println(c1);
		//注意方法的重写
		Circle c3=new Circle(1.2, "red", 2.2);
		Circle c4=new Circle(1.2, "black", 2.2);
		System.out.println(c3.equals(c4));
	}
	

}
