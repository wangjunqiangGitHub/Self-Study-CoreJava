package com.wjq.cn.designpatterns.adapter.ducks;

/**
 * 
*  @author  wjq  
*  @ClassName  : FlyWithWings  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年3月14日 上午10:52:05
*  这个是可以飞的,给真正的可以飞的鸭子用
*  
 */
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying....");
	}

}
