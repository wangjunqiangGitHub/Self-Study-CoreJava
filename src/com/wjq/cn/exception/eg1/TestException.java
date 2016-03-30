package com.wjq.cn.exception.eg1;

import java.util.Date;

import org.junit.Test;

/**
 * ㈠.异常的体系结构
 * 	java.lang.Throwable
 * 		|-----java.lang.Error：错误，程序是不能处理的，属于系统异常，程序是不能处理的
 * 		|-----java.lang.Exception:异常，要求编写代码时就要考虑到这些异常并进行处理
 * 				|----编译时异常:在编译期间会出现的异常即【执行javac.exe时发生的异常】
 * 				|----运行时异常：在代码运行期间出现的异常即【执行java.exe时发生的异常】
 * 					运行时异常父类时java.lang.RuntionException
 * 
 * 当一个程序执行的过程中发生了异常，那么之后的代码就将不会再执行！
 */
public class TestException {
	
	//编译时异常
	@Test
	public void test(){
		
		//FileNotFoundException
		/*FileInputStream fileInputStream=new FileInputStream(new File("note.txt"));
		int len=0;
		byte[] b=new byte[1024];
		//IOException
		while((len=fileInputStream.read(b))!=-1){
			System.out.println(len);
		}
		fileInputStream.close();*/
	}
	
	//常见的运行时异常
	//❹.NullPointException
	@Test
	public void test4(){
		String string=null;
		System.out.println(string.length());
	}
	
	//❸.ClassCastException
	@Test
	public void test3(){
		Object obj=new Date();
		String str=((String)obj);
	}
	
	
	//❷.ArithmeticException
	@Test
	public void test2(){
		int i=10/0;
		System.out.println(i);
	}
	//❶.ArrayIndexOutOfBoundsException
	@Test
	public void test1(){
		int[] array=new int[10];
		System.out.println(array[11]);
	}
	
	
	
	
	
	

}
