package com.wjq.cn.exception.eg1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestOverride {
	public static void main(String[] args) {
		A a = new B();
		try {
			a.method();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class A {
	public void method() throws IOException  {

	}

	public void method1() throws IOException {

	}
}

class B extends A {
	/**
	 * 子类在重写父类的方法时，要么不显示得抛异常，
	 * 
	 */
	public void method() {

	}
	
	/**
	 * 要抛则抛出的异常的类型要和父类方法里面定义的异常要兼容compatible
	 * 即抛出的异常的类型必须要被父类异常包含，否则编译不通过
	 */
	public void method1() throws FileNotFoundException {

	}
}
