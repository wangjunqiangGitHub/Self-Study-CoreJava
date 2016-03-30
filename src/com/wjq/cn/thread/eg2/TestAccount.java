package com.wjq.cn.thread.eg2;
/**
 * 
*  @author  wjq  
*  @ClassName  : TestAccount  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年3月1日 下午5:29:48
*  测试：
*  	银行有一个账户。有两个储户分别向同一个账户存3000元，每次存1000，存3次。每次存完打印账户余额。
*  
 */
public class TestAccount {
	
	public static void main(String[] args) {
		Account account=new Account();
		
		Customer customer1=new Customer(account, "账户1");
		Customer customer2=new Customer(account, "账户2");
		
		customer1.start();
		customer2.start();
	}

}

class Account{
	double balance=0;
	
	public Account(){
		
	}
	
	//存钱
	/**
	 * 为了看到更加明显的情况，我们可以让当前的线程睡眠10毫秒
	 * 
	 * 
	 * 此处添加synchronized后可以避免“账户1”存钱了，但是还没打印，“账户2”立马又存钱，
	 * 	导致“账户1”抢到cpu资源之后打印出来的
	 * 	账户余额已经是“账户2”存完钱之后账户的余额，导致了线程的不安全。
	 * @param money
	 * 为了达到用户交替的向同一个用户存钱，并打印余额，我们要使用线程的通信
	 */
	public synchronized void deposit(double money){
		//账户1得到同步锁之后，马上唤醒账户2也来存钱，因为此时账户1已经拿到同步锁，所以此时唤醒账户2也没有关系
		notify();
		balance+=money;
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"打印余额："+balance);
		//在账户1存完钱并打印完账户的余额之后，释放同步锁，此时再由已经被唤醒的账户2来存强
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class Customer extends Thread{
	private Account account;
	
	public Customer(Account account,String threadName){
		super(threadName);
		this.account=account;
	}
	
	public void run(){
		for(int i=0;i<3;i++){
			account.deposit(1000);
		}
	}
	
}







