package com.wjq.cn.thread.eg1;

/**
 * 
 * @author wjq
 * @ClassName : TestWindow1
 * @Version
 * @ModifiedBy
 * @Copyright asiainfo
 * @date 2016��2��29�� ����10:58:35
 * 
 *       ʹ��ʵ�ֵķ�ʽʵ�ֻ�Ʊ������Ʊ�� �γ�������̰߳�ȫ�����⣬����ֺ��ӡ��Ʊ�����Լ��ظ��ĳ�Ʊ
 */
public class TestWindow1 {

	public static void main(String[] args) {
		Window1 w1 = new Window1();
		Thread t1 = new Thread(w1);
		Thread t2 = new Thread(w1);
		Thread t3 = new Thread(w1);
		t1.setName("����1");
		t2.setName("����2");
		t3.setName("����3");
		
		t1.start();
		t2.start();
		t3.start();

	}

}

class Window1 implements Runnable {
	 int ticket = 100;

	@Override
	public void run() {
		while (true) {
			if (ticket > 0) {
				try {
					Thread.currentThread().sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"������Ʊ��Ʊ��Ϊ"+ticket--);
			}else {
				break;
			}
		}

	}

}
