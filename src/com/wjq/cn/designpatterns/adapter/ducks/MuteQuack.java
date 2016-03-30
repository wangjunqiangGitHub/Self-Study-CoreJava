package com.wjq.cn.designpatterns.adapter.ducks;
/**
 * 
*  @author  wjq  
*  @ClassName  : MuteQuack  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年3月14日 上午10:58:49
*  使用这个的鸭子是不会叫的
 */
public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("使用这个的鸭子是不会叫的...");
	}

}
