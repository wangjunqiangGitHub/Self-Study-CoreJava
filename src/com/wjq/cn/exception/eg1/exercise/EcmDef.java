package com.wjq.cn.exception.eg1.exercise;

/**
 * ��дӦ�ó���EcmDef.java�����������е�����������Ҫ�������븺�����������������
 * ���������Ͳ�һ��(NumberFormatException)��ȱ�������в���(ArrayIndexOutOfBoundsException��
 * ��0(ArithmeticException)�����븺��(EcDef �Զ�����쳣)�����쳣���� ��ʾ��
 * (1)������(EcmDef)�ж����쳣����(ecm)�������������ܡ� (2)��main()������ʹ���쳣�����������쳣����
 * (3)�ڳ����У��Զ����Ӧ���븺�����쳣��(EcDef)�� (4)����ʱ���ܲ��� java EcmDef 20 10 //args[0]=��20��
 * args[1]=��10�� (5)Interger���static����parseInt(String s)��sת���ɶ�Ӧ��intֵ����int
 * a=Interger.parseInt(��314��); //a=314;
 */
public class EcmDef {
	public static void main(String[] args) {
		try {
			Integer i=Integer.parseInt(args[0]);
			Integer j=Integer.parseInt(args[1]);
			div(i, j);
		}catch (ArrayIndexOutOfBoundsException  e) {
			System.out.println("ȱ�ٲ���");
		}catch (NumberFormatException e) {
			System.out.println("�������Ͳ�ƥ��");
		}catch (ArithmeticException e) {
			System.out.println("��ĸΪ0��");
		} catch (EcmDefException e) {
			e.printStackTrace();
		}
		

	}

	public static void div(int i, int j) throws EcmDefException {
		if (i < 0 || j < 0) {
			throw new EcmDefException("��������Ϊ0");
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
