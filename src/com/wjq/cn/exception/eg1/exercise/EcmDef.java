package com.wjq.cn.exception.eg1.exercise;

/**
 * 编写应用程序EcmDef.java，接收命令行的两个参数，要求不能输入负数，计算两数相除。
 * 对数据类型不一致(NumberFormatException)、缺少命令行参数(ArrayIndexOutOfBoundsException、
 * 除0(ArithmeticException)及输入负数(EcDef 自定义的异常)进行异常处理。 提示：
 * (1)在主类(EcmDef)中定义异常方法(ecm)完成两数相除功能。 (2)在main()方法中使用异常处理语句进行异常处理。
 * (3)在程序中，自定义对应输入负数的异常类(EcDef)。 (4)运行时接受参数 java EcmDef 20 10 //args[0]=“20”
 * args[1]=“10” (5)Interger类的static方法parseInt(String s)将s转换成对应的int值。如int
 * a=Interger.parseInt(“314”); //a=314;
 */
public class EcmDef {
	public static void main(String[] args) {
		try {
			Integer i=Integer.parseInt(args[0]);
			Integer j=Integer.parseInt(args[1]);
			div(i, j);
		}catch (ArrayIndexOutOfBoundsException  e) {
			System.out.println("缺少参数");
		}catch (NumberFormatException e) {
			System.out.println("参数类型不匹配");
		}catch (ArithmeticException e) {
			System.out.println("分母为0了");
		} catch (EcmDefException e) {
			e.printStackTrace();
		}
		

	}

	public static void div(int i, int j) throws EcmDefException {
		if (i < 0 || j < 0) {
			throw new EcmDefException("参数不能为0");
		}
		System.out.println(i / j);
	}

}

class EcmDefException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5401626929022437936L;

	public EcmDefException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EcmDefException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public EcmDefException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public EcmDefException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public EcmDefException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
