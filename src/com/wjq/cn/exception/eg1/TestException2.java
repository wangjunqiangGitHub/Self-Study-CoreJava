package com.wjq.cn.exception.eg1;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.junit.Test;

/**
 * ㈡.异常Exception的处理
 * 	java提供的异常的处理机制是
 * 	⑴.“抛”:
 * 		❶.当我们在执行代码的时候，一旦产生异常，就会在出现异常的地方产生一个对应的异常类的对象,我们将该对象抛出
 * 		❷.一旦该异常抛出了程序就终止执行了
 * 		❸.抛出的异常对象是抛给了该方法的调用者
 * 		❹.抛分为“自动抛”和“手动抛”
 * 		
 * 	⑵.“抓”：我们将上一步抛出来的异常对象捕获即为“抓”，如何抓就是异常的处理方式
 * 
 * 		Ⅰ.异常的处理方式一
 * 		try{
 * 			//可能出现异常的地方
 * 		}catch(Exception1 e){
 * 			//处理方式1	
 * 		}catch(Exception2 e){
 * 			//处理方式2
 * 		}finally{
 * 			//一定要执行的代码
 * 		}
 * 		以上代码块要注意的地方：
 * 		❶.try里面定义的变量相当于局部变量，出了try语句块就不能被调用了
 * 		❷.finally是可选的。finally里的代码是无论如何都会执行的，不管try里面是否发生了异常，以及是否return
 * 		❸.catch里面是对异常对象的处理，e.printStackTrace(); e.getMessage();
 * 		❹当有对个catch时，要捕获的异常对象会从上到下去匹配catch里面异常的类型，一旦满足就会执行catch里面的代码块
 * 			，当执行完毕之后就跳出其后的多个catch语句块
 * 		❺如果异常处理了就会执行后续的代码
 * 		❻如果多个catch里面的异常类型是并列关系则熟上熟下都可以
 * 			若他们之间是包含关系，则子类对应的catch必须要在父类对应的catch上面
 * 		❼try{}catch是可以嵌套使用的
 * 		
 * 	⑶.对于编译时异常我们可以显示的捕获，对于运行时异常我们不可以进行显示捕获	
 * 	
 * 	
 * 
 */
public class TestException2 {
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
			try {
				System.out.println(string.length());
			} catch (NullPointerException e) {
				// TODO: handle exception
				
				System.out.println(e);
			}
		}
		
		//❸.ClassCastException
		@Test
		public void test3(){
			try {
				Object obj=new Date();
				String str=((String)obj);
			} catch (ClassCastException e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println(e);
			}
		}
		
		
		//❷.ArithmeticException
		@Test
		public void test2(){
			try {
				int i=10/0;
				System.out.println(i);
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		//❶.ArrayIndexOutOfBoundsException
		@Test
		public void test1(){
			int[] array=new int[10];
			try {
				System.out.println(array[11]);
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		
		
		@Test
		public void test0(){
			try {
				Scanner scanner=new Scanner(System.in);
				int i=scanner.nextInt();
				System.out.println(i);
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("输入的类型不匹配");
			}
			
		}
		
		
		

}
