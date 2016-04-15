package com.wjq.cn.thread.eg2;

/**
 * 
 * @author wjq
 * @ClassName : TestSingleton
 * @Version
 * @ModifiedBy
 * @Copyright asiainfo
 * @date 2016��3��1�� ����3:12:23 �̰߳�ȫ�ĵ���ģʽ������ģʽ��
 */
public class TestSingleton {
	public static void main(String[] args) {
		new Thread("�߳�1") {
			public void run() {
				int i = 0;
				while (true) {
					System.out.println(Thread.currentThread().getName() + ":"
							+ Singleton.getSingleton().hashCode() + "  class="
							+ Singleton.class.hashCode());
					try {
						Thread.currentThread().sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (i++ > 3) {
						break;
					}
				}
			}
		}.start();
		new Thread("�߳�2") {
			public void run() {
				int i = 0;
				while (true) {
					System.out.println(Thread.currentThread().getName() + ":"
							+ Singleton.getSingleton().hashCode() + "  class="
							+ Singleton.class.hashCode());
					try {
						Thread.currentThread().sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (i++ > 3) {
						break;
					}
				}
			}
		}.start();

	}
}

class Singleton {
	// 1.����������������˽�е�private
	private Singleton() {
		int b=0;
		int a=0;
	}

	// 2.����˽�е���Ҫ���ص�ʵ��
	private static volatile Singleton singleton = null;

	// 3.�ṩ����ȡ��ʵ������ķ���
	public static Singleton getSingleton() {
		if (singleton == null) {// �Ż�����������ģʽ
			// 4.Ҫ�ǲ���ͬ�����ͻ�����߳�ͬ����ȫ������
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

}
