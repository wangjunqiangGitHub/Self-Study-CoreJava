package com.wjq.cn.designpatterns.adapter.ducks;
/**
 * 
*  @author  wjq  
*  @ClassName  : MuteQuack  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016��3��14�� ����10:58:49
*  ʹ�������Ѽ���ǲ���е�
 */
public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("ʹ�������Ѽ���ǲ���е�...");
	}

}
