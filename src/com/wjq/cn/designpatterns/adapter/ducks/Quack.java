package com.wjq.cn.designpatterns.adapter.ducks;

/**
 * 
*  @author  wjq  
*  @ClassName  : Quack  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年3月14日 上午10:56:20
*  这个是实现鸭子"呱呱的叫"
 */
public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("呱呱呱。。。");
	}

}
