package com.wjq.cn.thread.eg1;

/**
 * 
 * @author wjq
 * @ClassName : TestWindow
 * @Version
 * @ModifiedBy
 * @Copyright asiainfo
 * @date 2016��2��29�� ����10:42:28
 * 
 *ģ���վ3��������Ʊ������ �治�����̰߳�ȫ�����⣿������
 *
 *��ӡ��Ʊ������ظ��ĳ�Ʊ���Լ�����ĳ�Ʊ
 *
 */
public class TestWindow {
	public static void main(String[] args) {
		// ����3�����ڵ��߳�
		Window w1 = new Window();
		Window w2 = new Window();
		Window w3 = new Window();

		w1.setName("����1");
		w2.setName("����2");
		w3.setName("����3");

		w1.start();
		w2.start();
		w3.start();
	}

}

class Window extends Thread {
	static int ticket = 100;

	public void run() {
		while (true) {
			if (ticket > 0) {
				try {
					Thread.currentThread().sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + ":��Ʊ��Ʊ��Ϊ"
						+ ticket--);
			} else {
				break;
			}
		}
	}
}