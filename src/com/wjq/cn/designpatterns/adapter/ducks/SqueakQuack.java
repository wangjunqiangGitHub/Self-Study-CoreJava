package com.wjq.cn.designpatterns.adapter.ducks;
/**
 * 
*  @author  wjq  
*  @ClassName  : SqueakQuack  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016��3��14�� ����10:57:46
*  ʹ�������Ѽ����֨֨�Ľ�
 */
public class SqueakQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Ѽ����֨֨�Ľ�....");
		
	}

}
