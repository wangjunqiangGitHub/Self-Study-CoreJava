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
*  泛型的使用需要掌握以下几点:
*  	❶在集合中使用泛型【掌握】
*  	❷自定义泛型类，泛型接口，泛型方法【理解和使用】
*  	❸泛型和继承的关系
*  	❹通配符
 */
public class TestGeneric {
	/**
	 * 通配符的使用
	 */
	@Test
	public void test7(){
		List<Integer> list=null;
		List<String>list1=null;
		List<?> list2=null;
		
		list2=list;
		Iterator<?> iterator = list2.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next);
		}
//		list2.add("ccc");
//		list2.add(123);
		//声明为通配符的集合只能存放null这一个元素
		list2.addAll(null);
		
	}
	
	
	
	/**
	 * ?的使用
	 * List<A>和List<B>都是List<?>的子类
	 * <? extends A>存放的是A和A的子类
	 * <? super A>存放的是A和A的父类
	 */
	@Test
	public void test6(){
		List<?> list=null;
		List<String> list1=null;
		List<Integer>list2=null;
		list=list1;
		list=list2;
		
		//show(list);
		show1(list);
		show1(list1);
		show1(list2);
		
		List<? extends Number> list3=null;
		List<? super Number> list4=null;
		Object obj=new Object();
		List<Object>list5=null;
		list3=list2;
	//	list3=list;
		
		//list4=list2;
		//list4=list;
		list4=list5;
		
	}
	
	public void show(List<Object> list){
		
	}
	
	public void show1(List<?> list){
		
	}
	
	
	
	
	
	
	
	
	
	
	/**
	 * 泛型与继承的关系
	 * 若类A是类B的子类，那么List<A>不是List<B>的子接口
	 */
	@Test
	public void test5(){
		Object obj=null;
		String str="AA";
		obj=str;
		
		Object[] objs=null;
		String[] strs=new String[]{"aa","bb","cc"};
		objs=strs;
		
		
		List<Object> list=null;
		List<String> strList=new ArrayList<>();
	//	list=strList;
		
	}
	
	
	
	
	
	
	
	/**
	 * 自定义泛型的使用:
	 * ①.当我们实例化范型类型的对象时，指定了具体的类型，
	 * 	那么在该类中的所有使用泛型的地方都将变为指定的类型
	 * ②.当我们在使用泛型的类时，不指定类型的话，默认使用的是Object类型
	 */
	@Test
	public void test4(){
		Order<Boolean> order=new Order<>();
		Boolean t = order.getT();
		System.out.println(t);
		order.setT(true);
		System.out.println(order.getT());
		order.add();
		List<Boolean> list = order.list;
		System.out.println(list);
		
		
		SubOrder order2=new SubOrder();
		List<Integer> list2 = order2.list;
		String e = order2.getE("hahah");
		Double e2 = order.getE(12.3);
		Integer e3 = order2.getE(12);
		
		Integer[] arr=new Integer[]{1,2,3};
		ArrayList<Integer> list3=new ArrayList<>();
		List<Integer> fromArrayToList = order2.fromArrayToList(arr, list3);
		
		
		
		
		
		
		
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
