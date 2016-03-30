package com.wjq.cn.thread.eg2;

/**
 * 
 * @author wjq
 * @ClassName : TestProducerConsumer
 * @Version
 * @ModifiedBy
 * @Copyright asiainfo
 * @date 2016��3��1�� ����6:07:43 ������/����ʵ����
 * ������(Productor)����Ʒ������Ա(Clerk)����������(Customer)�ӵ�Ա��ȡ�߲�Ʒ��
 * ��Աһ��ֻ�ܳ��й̶������Ĳ�Ʒ(����:20���������������ͼ��������Ĳ�Ʒ����Ա���������ͣһ�£�
 * ��������п�λ�Ų�Ʒ����֪ͨ�����߼����������������û�в�Ʒ�ˣ���Ա����������ߵ�һ�£�
 * ��������в�Ʒ����֪ͨ��������ȡ�߲�Ʒ
 * 
 * ������
 * 	1.�Ƿ��漰�����̵߳����⣿�漰�����߳�  ��������/�����ߡ�
 * 	2.�Ƿ��漰�����������?  ��Ƶ����������
 * 	3.�˹����������˭?		����Ʒ��������
 * 	4.�Ƿ��漰���̵߳�ͨ���أ� �������������������ߵ�ͨ�š�
 */
public class TestProducerConsumer {
	public static void main(String[] args) {
		//����һ����Ա�Ķ���
		Clerk clerk=new Clerk();
		//����һ�������ߵĶ���
		Producer producer=new Producer(clerk);
		Thread tProducer=new Thread(producer);
		tProducer.setName("������1");
		Producer producer2=new Producer(clerk);
		Thread tProducer2=new Thread(producer2);
		tProducer2.setName("������2");
		Producer producer3=new Producer(clerk);
		Thread tProducer3=new Thread(producer3);
		tProducer3.setName("������3");
		//����һ�������ߵĶ���
		Consumer consumer=new Consumer(clerk);
		Thread tConsumer=new Thread(consumer);
		tConsumer.setName("������");
		//���������ߺ��������߳�
		tProducer.start();
		tProducer2.start();
		tProducer3.start();
		tConsumer.start();

	}
}

/**
 * ��Ա
 */
class Clerk{
	int num=0;
	/**
	 * ��Ա֪ͨ������������Ʒ��
	 */
	public synchronized void addProduct(){
		if(num>=20){
			try {
				//ֹͣ����
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			num++;
			System.out.println(Thread.currentThread().getName()+"������"+num+"����Ʒ");
			//��������������
			notify();
		}
	}
	/**
	 * ��Ա֪ͨ���������Ѳ�Ʒ
	 */
	public synchronized void consumerProduct(){
		if(num>0){
			System.out.println(Thread.currentThread().getName()+"�����˵�"+num+"����Ʒ");
			num--;
			//����������
			//notify();
			notifyAll();
		}else {
			try {
				//ֹͣ����
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}




/**
 * ������
 */
class Producer implements Runnable{
	private Clerk clerk;
	
	public Producer(Clerk clerk){
		this.clerk=clerk;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+"��ʼ����");
		while(true){
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clerk.addProduct();
		}
	}
}
/**
 * ������
 */
class Consumer implements Runnable{
	private Clerk clerk;
	
	public Consumer(Clerk clerk){
		this.clerk=clerk;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+"��ʼ����");
		while(true){
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clerk.consumerProduct();
		}
	}
}

