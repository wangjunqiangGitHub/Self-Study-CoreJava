package com.wjq.cn.thread.eg1;

/**
 * 
 * @author wjq
 * @ClassName : TestWindow3
 * @Version
 * @ModifiedBy
 * @Copyright asiainfo
 * @date 2016��2��29�� ����3:49:10 ʹ�ü̳еķ�ʽʵ�ִ�����Ʊ��ʹ��ͬ�������synchronized������߳�ͬ������
 */
public class TestWindow3 {
	public static void main(String[] args) {
		Window3 w1 = new Window3("����1");
		Window3 w2 = new Window3("����2");
		Window3 w3 = new Window3("����3");
		
		w1.start();
		w2.start();
		w3.start();
		System.out.println(Window3.class.hashCode());
		System.out.println(Window3.class.hashCode());

	}

}

class Window3 extends Thread {
	// ��������
	static int ticket = 100;
	static Object object=new Object();
	// �߳�
	public void run() {
		while (true) {
			//synchronized (this) {//this�ڴ˴��������w1,w2,w3��3���߳̿����Ĳ���ͬһ����
			synchronized (object) {
				if (ticket > 0) {//����object�������ó�static�ģ�����3���߳̾Ϳ�������ͬһ��object
					try {
						Thread.currentThread().sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ "������Ʊ��Ʊ��Ϊ��" + ticket--);
				} else {
					break;
				}
			}
		//show();

		}

	}
	
	
	/*
	 * synchronized�˴����Ķ������this
	 */
	public synchronized void show(){
		if (ticket > 0) {//����object�������ó�static�ģ�����3���߳̾Ϳ�������ͬһ��object
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()
					+ "������Ʊ��Ʊ��Ϊ��" + ticket--);
		} 
	}

	public Window3(String name) {
		super(name);
	}

}