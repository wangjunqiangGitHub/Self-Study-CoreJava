package com.wjq.cn.designpatterns.adapter.ducks;

/**
 * 
*  @author  wjq  
*  @ClassName  : Quack  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016��3��14�� ����10:56:20
*  �����ʵ��Ѽ��"���ɵĽ�"
 */
public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("�����ɡ�����");
	}

}
