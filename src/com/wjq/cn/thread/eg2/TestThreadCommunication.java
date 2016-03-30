package com.wjq.cn.thread.eg2;

/**
 * 
 * @author wjq
 * @ClassName : TestThreadCommunication
 * @Version
 * @ModifiedBy
 * @Copyright asiainfo
 * @date 2016��3��1�� ����4:36:36 �߳�֮��ͨ�ŵ����⣬��Ҫ���õ�3��������wait��notify��notifyAll
 *       ע�⣺������3���ؼ��ֱ�����ͬ��������ͬ����������ʹ�� wait()��������ǰ�߳�ִ�е�wait����ʱ�����ó�cpu��Դ���ͷ�ͬ����
 *       notify��notifyAll������wait��һ���̻߳����߳�
 * 
 *       eg:��ӡ1����100�����߳̽����ӡ
 * 
 */
public class TestThreadCommunication {

	public static void main(String[] args) {
		PrintNum p1 = new PrintNum();
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p1);
		t1.setName("��");
		t2.setName("��");
		t1.start();
		t2.start();

	}
}

class PrintNum implements Runnable {
	int num = 1;
	Object obj=new Object();
	public void run() {

		while (true) {
			synchronized (this) {
				this.notify();
				if (num <= 100) {
					System.out.println(Thread.currentThread().getName() + " : "
							+ num);
					num++;
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					break;
				}
			}
		}
	}

}
