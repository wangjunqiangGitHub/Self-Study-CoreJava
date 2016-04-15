package com.wjq.cn.designpatterns.adapter.ducks;
/**
 * 
*  @author  wjq  
*  @ClassName  : TestPrintLog2  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年3月14日 上午11:18:34
*  策略模式：定义了算法族，让他们之间可以互相的替换，此模式让算法的变化独立于使用算法的客户
*  
*  
*  通过这个例子我们得知：
*  	①多用组合少用继承
*  	②我们要针对接口编程，而不是针对实现编程
*  	③我们要封装变化的
*  
*  
*  
*  
 */
public class Test {
	public static void main(String[] args) {
		Duck canDuck =new DuckCanFly();
		canDuck.performFly();
		canDuck.performQuack();
		
		//我们动态的改变鸭子的行为，当然这个方法必须在父类提供
		canDuck.setQuackBehavior(new MuteQuack());
		
		canDuck.performQuack();
		
		
	}

}
