package com.wjq.cn.thread.eg2;

/**
 * 
 * @author wjq
 * @ClassName : TestDeadLock
 * @Version
 * @ModifiedBy
 * @Copyright asiainfo
 * @date 2016��3��1�� ����2:58:20 �����ַ��������� //����������ֻ�����߳�ͬ����ʱ��Ż����
 *       //��ͬ���̷ֱ߳�ռ�öԷ���Ҫ����Դ�����������ڵȴ��Է��ͷ��Լ������ͬ����Դ�������ͻ�������� //����д����Ҫ������������
 */
public class TestDeadLock {

	static StringBuffer sb1 = new StringBuffer();
	static StringBuffer sb2 = new StringBuffer();

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				synchronized (sb1) {
					sb1.append("A");
					try {
						Thread.currentThread().sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (sb2) {
						sb2.append("B");
						System.out.println(sb1);
						System.out.println(sb2);
					}
				}
			}
		}.start();
		new Thread() {
			public void run() {
				synchronized (sb2) {
					try {
						Thread.currentThread().sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sb2.append("C");
					synchronized (sb1) {
						sb1.append("D");
						System.out.println(sb1);
						System.out.println(sb2);
					}
				}
			}
		}.start();
	}

}
