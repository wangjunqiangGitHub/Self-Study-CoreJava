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
*  @date  2016年2月22日 下午2:21:42
*  
*  利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级。
	提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的长度。
	而向量类java.util.Vector可以根据需要动态伸缩。
	创建Vector对象：Vector v=new Vector();
	给向量添加元素：v.addElement(obj);   //obj必须是对象
	取出向量中的元素：Object  obj=v.elementAt(0);
	注意第一个元素的下标是0，返回值是Object类型的。
	计算向量的长度：v.size();
	若与最高分相差10分内：A等；20分内：B等；
	  30分内：C等；其它：D等
*  
*  
*  
*  
*  
 */
public class TestScore {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("录入学生的分数，当录入负数时终止录入显示已录入的学生的分数和等级。。");
		Vector vector=new Vector();
		int maxScore=0;
		for(;;){
			int score=scanner.nextInt();
			if(score<0){
				break;
			}
			//获取学生成绩中的最高分
			if(maxScore<score){
				maxScore=score;
			}
			//集合中添加score
			vector.add(score);
		}
		//遍历集合中学生的分数，并得出等级
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
			System.out.println("学生的成绩是"+score+"等级是"+level);
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
