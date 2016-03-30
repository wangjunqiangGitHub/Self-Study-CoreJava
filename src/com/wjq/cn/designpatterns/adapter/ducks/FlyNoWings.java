package com.wjq.cn.designpatterns.adapter.ducks;
/**
 * 
*  @author  wjq  
*  @ClassName  : FlyNoWings  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016��3��14�� ����10:54:13
*  ����ǲ����Էɵģ�����ƤѼ�����ն�Ѽʹ�õ�
*  
 */
public class FlyNoWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can fly....");
	}

}
