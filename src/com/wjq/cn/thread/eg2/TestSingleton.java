package com.wjq.cn.thread.eg2;

/**
 * 
 * @author wjq
 * @ClassName : TestSingleton
 * @Version
 * @ModifiedBy
 * @Copyright asiainfo
 * @date 2016年3月1日 下午3:12:23 线程安全的单例模式【懒汉模式】
 */
public class TestSingleton {
	public static void main(String[] args) {
		new Thread("线程1") {
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
		new Thread("线程2") {
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
	// 1.首先声明构造器是私有的private
	private Singleton() {
		int b=0;
		int a=0;
	}

	// 2.声明私有的需要返回的实例
	private static volatile Singleton singleton = null;

	// 3.提供外界获取该实例对象的方法
	public static Singleton getSingleton() {
		if (singleton == null) {// 优化此懒汉单例模式
			// 4.要是不加同步锁就会出现线程同步安全的问题
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

}
