package com.wjq.cn.extend.eg1;

import java.util.Scanner;
import java.util.Vector;

/**
 * 
*  @author  wjq  
*  @ClassName  : TestScore  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016��2��22�� ����2:21:42
*  
*  ����Vector�������鴦���Ӽ��̶���ѧ���ɼ����Ը�������������������ҳ���߷֣������ѧ���ɼ��ȼ���
	��ʾ������һ�����������Ⱦ͹̶����䣬�����ڴ�������ǰ����Ҫ֪�����ĳ��ȡ�
	��������java.util.Vector���Ը�����Ҫ��̬������
	����Vector����Vector v=new Vector();
	���������Ԫ�أ�v.addElement(obj);   //obj�����Ƕ���
	ȡ�������е�Ԫ�أ�Object  obj=v.elementAt(0);
	ע���һ��Ԫ�ص��±���0������ֵ��Object���͵ġ�
	���������ĳ��ȣ�v.size();
	������߷����10���ڣ�A�ȣ�20���ڣ�B�ȣ�
	  30���ڣ�C�ȣ�������D��
*  
*  
*  
*  
*  
 */
public class TestScore {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("¼��ѧ���ķ�������¼�븺��ʱ��ֹ¼����ʾ��¼���ѧ���ķ����͵ȼ�����");
		Vector vector=new Vector();
		int maxScore=0;
		for(;;){
			int score=scanner.nextInt();
			if(score<0){
				break;
			}
			//��ȡѧ���ɼ��е���߷�
			if(maxScore<score){
				maxScore=score;
			}
			//���������score
			vector.add(score);
		}
		//����������ѧ���ķ��������ó��ȼ�
		for (Object object : vector) {
			Integer score=(Integer) object;
			char level=0;
			if(score>=maxScore-10){
				level='A';
			}else if (score>=maxScore-20) {
				level='B';
			}else if (score>=maxScore-30) {
				level='C';
			}else {
				level='D';
			}
			System.out.println("ѧ���ĳɼ���"+score+"�ȼ���"+level);
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
