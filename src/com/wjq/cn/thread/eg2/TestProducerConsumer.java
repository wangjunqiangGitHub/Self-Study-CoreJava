package com.wjq.cn.thread.eg2;

/**
 * 
 * @author wjq
 * @ClassName : TestProducerConsumer
 * @Version
 * @ModifiedBy
 * @Copyright asiainfo
 * @date 2016年3月1日 下午6:07:43 生产者/消费实例：
 * 生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，
 * 店员一次只能持有固定数量的产品(比如:20），如果生产者试图生产更多的产品，店员会叫生产者停一下，
 * 如果店中有空位放产品了再通知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，
 * 如果店中有产品了再通知消费者来取走产品
 * 
 * 分析：
 * 	1.是否涉及到多线程的问题？涉及到多线程  【生产者/消费者】
 * 	2.是否涉及到共享的数据?  设计到共享的数据
 * 	3.此共享的数据是谁?		【商品的数量】
 * 	4.是否涉及到线程的通信呢？ 【存在生产者与消费者的通信】
 */
public class TestProducerConsumer {
	public static void main(String[] args) {
		//创建一个店员的对象
		Clerk clerk=new Clerk();
		//创建一个生产者的对象
		Producer producer=new Producer(clerk);
		Thread tProducer=new Thread(producer);
		tProducer.setName("生产者1");
		Producer producer2=new Producer(clerk);
		Thread tProducer2=new Thread(producer2);
		tProducer2.setName("生产者2");
		Producer producer3=new Producer(clerk);
		Thread tProducer3=new Thread(producer3);
		tProducer3.setName("生产者3");
		//创建一个消费者的对象
		Consumer consumer=new Consumer(clerk);
		Thread tConsumer=new Thread(consumer);
		tConsumer.setName("消费者");
		//启动生产者和消费者线程
		tProducer.start();
		tProducer2.start();
		tProducer3.start();
		tConsumer.start();

	}
}

/**
 * 店员
 */
class Clerk{
	int num=0;
	/**
	 * 店员通知生产者生产产品，
	 */
	public synchronized void addProduct(){
		if(num>=20){
			try {
				//停止生产
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			num++;
			System.out.println(Thread.currentThread().getName()+"生产第"+num+"个产品");
			//唤醒消费者消费
			notify();
		}
	}
	/**
	 * 店员通知消费者消费产品
	 */
	public synchronized void consumerProduct(){
		if(num>0){
			System.out.println(Thread.currentThread().getName()+"消费了第"+num+"个产品");
			num--;
			//唤醒生产者
			//notify();
			notifyAll();
		}else {
			try {
				//停止消费
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}




/**
 * 生产者
 */
class Producer implements Runnable{
	private Clerk clerk;
	
	public Producer(Clerk clerk){
		this.clerk=clerk;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+"开始生产");
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
 * 消费者
 */
class Consumer implements Runnable{
	private Clerk clerk;
	
	public Consumer(Clerk clerk){
		this.clerk=clerk;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+"开始消费");
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

