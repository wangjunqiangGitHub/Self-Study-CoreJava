package com.wjq.cn.designpatterns.adapter.ducks;
/**
 * 
*  @author  wjq  
*  @ClassName  : FlyNoWings  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年3月14日 上午10:54:13
*  这个是不可以飞的，给橡皮鸭或者诱饵鸭使用的
*  
 */
public class FlyNoWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can fly....");
	}

}
