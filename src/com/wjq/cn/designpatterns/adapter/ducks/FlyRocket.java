package com.wjq.cn.designpatterns.adapter.ducks;
/**
 * 
*  @author  wjq  
*  @ClassName  : FlyRocket  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年3月14日 上午11:01:17
*  使用这个的鸭子可以像火箭一样的飞
 */
public class FlyRocket implements FlyBehavior{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("鸭子可以像火箭一样的飞...");
	}

}
