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
	 * ��������д����ķ���ʱ��Ҫô����ʾ�����쳣��
	 * 
	 */
	public void method() {

	}
	
	/**
	 * Ҫ�����׳����쳣������Ҫ�͸��෽�����涨����쳣Ҫ����compatible
	 * ���׳����쳣�����ͱ���Ҫ�������쳣������������벻ͨ��
	 */
	public void method1() throws FileNotFoundException {

	}
}
