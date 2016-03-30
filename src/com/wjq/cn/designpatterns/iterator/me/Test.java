package com.wjq.cn.designpatterns.iterator.me;
/**
 * 
*  @author  wjq  
*  @ClassName  : Test  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016��3��15�� ����10:41:50
*  �������ģʽ�м���collection�е�Iterator�����ģʽ
*  Ϊ��ʹ��ͬ�ļ��϶���ʹ��ͬһ�ַ�ʽȥ�������������ǲ�������ӿڱ�̵ķ�ʽ��
*  ����һ��Iterator�Ľӿڣ������ʵ��Ҫ����������ʵ�����о����ʵ�ֵĵ�����
*  
 */
public class Test {
	
	public static void main(String[] args) {
		Collection list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list.size());
		Collection linkedList=new LinkedList();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		System.out.println(linkedList.size());
		
		//ʹ��Collection����iterator()������ArrayList����
		Iterator iterator = list.iterator();
		System.out.println(iterator.getClass().getName());
		while (iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next);
			
		}
		
	}
	

}
