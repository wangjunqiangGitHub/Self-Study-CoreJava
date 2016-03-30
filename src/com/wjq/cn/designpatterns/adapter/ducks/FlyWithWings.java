package com.wjq.cn.designpatterns.adapter.ducks;

/**
 * 
*  @author  wjq  
*  @ClassName  : FlyWithWings  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016��3��14�� ����10:52:05
*  ����ǿ��Էɵ�,�������Ŀ��Էɵ�Ѽ����
*  
 */
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying....");
	}

}
