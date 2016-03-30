package com.wjq.cn.thread.eg2;

public class TestMyield {

	public static void main(String[] args) {
		MyCount count = new MyCount();
		MyT myT = new MyT(count);
		MyThread myThread = new MyThread(count);
		Thread t1 = new Thread(myT);
		Thread t2 = new Thread(myT);
		Thread t3 = new Thread(myT);
		Thread t4 = new Thread(myT);
		Thread t5 = new Thread(myT);
		Thread t6 = new Thread(myT);

		myThread.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();

	}

}

class MyCount {

	public int count;

	public synchronized void add() {
		if(count>10000){
			notify();
			System.out.println(Thread.currentThread().getName()+"notify()");
		}else {
			count++;
			System.out.println(Thread.currentThread().getName()+"="+count);
		}
	}

	public synchronized void print() {
		if(count<10000){
			try {
				System.out.println(Thread.currentThread().getName()+"wait()");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			System.out.println("ÀÛ¼ÓºÍ="+count);
	}
}

class MyT implements Runnable {
	private MyCount count;

	public MyT(MyCount count) {
		this.count = count;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			if(count.count>10000){
				break;
			}else {
				count.add();
			}
		}
	}

}

class MyThread extends Thread {

	private MyCount count;

	public MyThread(MyCount count) {
		this.count = count;
	}

	public void run() {
				count.print();
	}

}
