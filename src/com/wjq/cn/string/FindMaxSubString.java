package com.wjq.cn.string;

/**
 * 
 *  @author  wjq  
 *  @ClassName  : FindMaxSubString  
 *  @Version     
 *  @ModifiedBy   
 *  @Copyright  asiainfo  
 *  @date  2016��2��26�� ����2:28:41
 *  �������ַ��������������ֵĹ������� 
 *  ����queryΪacbac��textΪacaccbabb��ô�����Ӵ�Ϊcba ����Ϊ3
 */
import java.util.Scanner;

public class FindMaxSubString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������query");
		/*
		 * String str1 = "acbac"; String str2 = "acaccbabb";
		 * 
		 * 

		 * 
		 * 
		 */
		String str1 = s.nextLine();
		System.out.println("������text");
		String str2 = s.nextLine();
		String result = getMaxString(str1, str2);
		if (result != null) {
			System.out.println(result.length());
		} else {
			System.out.println("û�й����Ӵ�");
		}
	}

	private static String getMaxString(String str1, String str2) {
		String max = null;
		String min = null;
		max = (str1.length() > str2.length() ? str1 : str2);
		min = max.equals(str1) ? str2 : str1;
		for (int i = 0; i < min.length(); i++) {
			for (int start = 0, end = min.length() - i; end != min.length() + 1; start++, end++) {
				String sub = min.substring(start, end);
				if (max.contains(sub))
					return sub;
			}
		}
		return null;
	}
}