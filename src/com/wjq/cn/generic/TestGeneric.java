package com.wjq.cn.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;
/**
 * 
*  @author  wjq  
*  @ClassName  : TestGeneric  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年2月23日 下午2:33:56
*  泛型的使用需要掌握以下几点:
*  	❶在集合中使用泛型【掌握】
*  	❷自定义泛型类，泛型接口，泛型方法【理解和使用】
*  	❸泛型和继承的关系
*  	❹通配符
 */
public class TestGeneric {
	
	/**
	 * 自定义泛型的使用
	 */
	@Test
	public void test4(){
		
		
		
		
	}
	
	@Test
	public void test3(){
		Map<String,Integer> map = new HashMap<>();
		map.put("AA", 78);
		map.put("BB", 87);
		map.put("DD", 98);
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
		}
	}
	
	
	
	
	
	/**
	 * 在集合中使用泛型,当我们使用了泛型之后我们可以限制向集合中添加的元素的类型，
	 * 我们在遍历时就可以根据相应的类型强转从而不会报ClassCastException的运行时异常
	 */
	@Test
	public void test2(){
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		//list.add("AA");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}
	/**
	 * 在集合中没有使用泛型的情况
	 */
	@Test
	public void test1(){
		List list=new ArrayList();
		//没有使用泛型时任何数据类型都可以添加进去
		list.add("AA");
		list.add("BB");
		list.add(1);
		list.add(2);
		for (Object object : list) {
			//将字符串强转为Integer时会报ClassCastException
			Integer obj=(Integer) object;
			System.out.println(obj);
		}
	}
	
	
	
	
	
	
	
	

}
