package com.wjq.cn.designpatterns.adapter.ducks;
/**
 * 
*  @author  wjq  
*  @ClassName  : TestPrintLog2  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016��3��14�� ����11:18:34
*  ����ģʽ���������㷨�壬������֮����Ի�����滻����ģʽ���㷨�ı仯������ʹ���㷨�Ŀͻ�
*  
*  
*  ͨ������������ǵ�֪��
*  	�ٶ���������ü̳�
*  	������Ҫ��Խӿڱ�̣����������ʵ�ֱ��
*  	������Ҫ��װ�仯��
*  
*  
*  
*  
 */
public class Test {
	public static void main(String[] args) {
		Duck canDuck =new DuckCanFly();
		canDuck.performFly();
		canDuck.performQuack();
		
		//���Ƕ�̬�ĸı�Ѽ�ӵ���Ϊ����Ȼ������������ڸ����ṩ
		canDuck.setQuackBehavior(new MuteQuack());
		
		canDuck.performQuack();
		
		
	}

}
