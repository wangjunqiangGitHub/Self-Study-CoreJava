package com.wjq.cn.thread.eg2;
/**
 * 
*  @author  wjq  
*  @ClassName  : TestAccount  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016��3��1�� ����5:29:48
*  ���ԣ�
*  	������һ���˻��������������ֱ���ͬһ���˻���3000Ԫ��ÿ�δ�1000����3�Ρ�ÿ�δ����ӡ�˻���
*  
 */
public class TestAccount {
	
	public static void main(String[] args) {
		Account account=new Account();
		
		Customer customer1=new Customer(account, "�˻�1");
		Customer customer2=new Customer(account, "�˻�2");
		
		customer1.start();
		customer2.start();
	}

}

class Account{
	double balance=0;
	
	public Account(){
		
	}
	
	//��Ǯ
	/**
	 * Ϊ�˿����������Ե���������ǿ����õ�ǰ���߳�˯��10����
	 * 
	 * 
	 * �˴����synchronized����Ա��⡰�˻�1����Ǯ�ˣ����ǻ�û��ӡ�����˻�2�������ִ�Ǯ��
	 * 	���¡��˻�1������cpu��Դ֮���ӡ������
	 * 	�˻�����Ѿ��ǡ��˻�2������Ǯ֮���˻������������̵߳Ĳ���ȫ��
	 * @param money
	 * Ϊ�˴ﵽ�û��������ͬһ���û���Ǯ������ӡ������Ҫʹ���̵߳�ͨ��
	 */
	public synchronized void deposit(double money){
		//�˻�1�õ�ͬ����֮�����ϻ����˻�2Ҳ����Ǯ����Ϊ��ʱ�˻�1�Ѿ��õ�ͬ���������Դ�ʱ�����˻�2Ҳû�й�ϵ
		notify();
		balance+=money;
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"��ӡ��"+balance);
		//���˻�1����Ǯ����ӡ���˻������֮���ͷ�ͬ��������ʱ�����Ѿ������ѵ��˻�2����ǿ
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







