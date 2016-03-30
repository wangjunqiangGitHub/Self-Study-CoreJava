package com.wjq.cn.exception.eg1;
/**
 * 自定义一个异常类
 * 	❶.继承现有的异常类
 * 	❷.提供几个相应的构造器
 * 	❸.提供一个序列号
 */
public class MyException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3814570434625415080L;

	public MyException() {
			
	}

	public MyException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public MyException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public MyException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	

}
