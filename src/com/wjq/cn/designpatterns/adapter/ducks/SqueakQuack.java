package com.wjq.cn.designpatterns.adapter.ducks;
/**
 * 
*  @author  wjq  
*  @ClassName  : SqueakQuack  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年3月14日 上午10:57:46
*  使用这个的鸭子是吱吱的叫
 */
public class SqueakQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("鸭子是吱吱的叫....");
		
	}

}
