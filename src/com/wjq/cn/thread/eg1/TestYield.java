package com.wjq.cn.thread.eg1;

/**
 * 
 * @author wjq
 * @ClassName : TestYield
 * @Version
 * @ModifiedBy
 * @Copyright asiainfo
 * @date 2016年3月8日 上午9:38:07 测试yield方法释放cpu资源
 */
public class TestYield {

	public static void main(String[] args) {

		/*Myield myield = new Myield();
		Thread t1 = new Thread(myield);
		Thread t2 = new Thread(myield);
		Thread t3 = new Thread(myield);
		Thread t4 = new Thread(myield);
		Thread t5 = new Thread(myield);
		Thread t6 = new Thread(myield);
		Thread t7 = new Thread(myield);
		Thread t8 = new Thread(myield);
		Thread t9 = new Thread(myield);
		Thread t10 = new Thread(myield);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		
		while(Thread.activeCount()>1){
			Thread.currentThread().yield();
		}
	
		
		
		System.out.println(myield.count);*/
		System.out.println("------------------------");
		MyCount count=new MyCount();
		Myield2 myield2=new Myield2(count);
		MyThread myThread=new MyThread(count);
		//设置为守护线程
		myThread.setDaemon(true);
		
		//子线程
		Thread t11 = new Thread(myield2);
		Thread t21 = new Thread(myield2);
		Thread t31 = new Thread(myield2);
		Thread t41= new Thread(myield2);
		Thread t51= new Thread(myield2);
		Thread t61= new Thread(myield2);
		Thread t71= new Thread(myield2);
		Thread t81= new Thread(myield2);
		Thread t91= new Thread(myield2);
		Thread t221 = new Thread(myield2);
		t11.start();
		t21.start();
		t31.start();
		t41.start();
		t51.start();
		t61.start();
		t71.start();
		t81.start();
		t91.start();
		t221.start();
		myThread.start();

	}

}

class Myield implements Runnable {
	 public int count = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			synchronized (this) {
				if (count > 1000000) {
					break;
				}
				count++;
			}
		}
	}

}


class Myield2 implements Runnable {
	 public MyCount count;
	 public  Myield2(MyCount count){
		 this.count=count;
	 }
	 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			synchronized (count) {
				if (count.count > 1000000) {
					break;
				}
				count.add();
			}
		}
	}

}

class MyCount{
	public int count;
	
	public MyCount() {
		// TODO Auto-generated constructor stub
	}
	
	public synchronized void add(){
		count++;
	}
	public synchronized int getCount(){
		return count;
	}
	
}


class MyThread extends Thread{
	
	public MyCount count;
	public MyThread(MyCount count){
		this.count=count;
	}
	
	
	
	
	public void run(){
			
			System.out.println("守护线程："+count.getCount());
		
	}
	
}





