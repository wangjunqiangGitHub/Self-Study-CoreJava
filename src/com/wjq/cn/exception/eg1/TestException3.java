package com.wjq.cn.exception.eg1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Ⅱ.异常的第二种处理的方式：
 * 		在方法的声明出显示的抛出异常
 * 		格式:public static void method1() throws FileNotFoundException,IOException{}
 * 			将该异常抛给方法的调用者，直至抛至main方法里面，当然在抛的过程中也可以显示的捕获处理
 * 
 * 
 * Ⅲ.java中异常模型：“抓”，“抛”
 * 	
 * 	抓：异常处理的方式有两种
 * 		❶.try{}catch(Exception e)finally{}
 * 		❷.throws+异常的类型
 * 	抛：抛分为“自动抛”和“手动抛”
 * 		手动抛：throw+异常
 * 		手动抛出的异常即可以是自定义的异常，也可以是java现成的异常
 */
public class TestException3 {
	
	public static void main(String[] args) {
		try {
			method2();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		method3();
	}
	
	
	
	public static void method3(){
		try {
			method1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void method2() throws FileNotFoundException, IOException{
		method1();
	}
	
	public static void method1() throws FileNotFoundException,IOException{
		FileInputStream fileInputStream =new FileInputStream(new File("text.txt"));
		int len;
		while((len=fileInputStream.read())!=-1){
			System.out.println((char)len);
		}
		
	}
	

}
