package com.wjq.cn.exception.eg1.exercise;

public class TestException2 {
	 public static void main(String args[]) {  
	        int i = 0;  
	        String greetings[] = { " Hello world !", " Hello World !! ",  
	                " HELLO WORLD !!!" };  
	        while (i < 4) {  
	            try {  
	                // �ر�ע��ѭ�����Ʊ���i����ƣ������������ѭ��  
	                System.out.println(greetings[i++]);  
	            } catch (ArrayIndexOutOfBoundsException e) {  
	                System.out.println("�����±�Խ���쳣");  
	            } finally {  
	                System.out.println("--------------------------");  
	            }  
	        }  
	    }  
}
