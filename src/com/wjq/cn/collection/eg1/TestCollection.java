package com.wjq.cn.collection.eg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import org.junit.Test;

/**
 * 引言：存储对象我们有两个选择： ⑴.数组 缺点：❶.长度是固定的 ❷.数组中实际存放的对象的个数是不确定的 ⑵.集合 Collection接口
 * |------List 存储有序的可重复的数据 |-----ArrayList,LinkedList【适用于频繁的插入删除】,Vector【线程安全的】
 * |------Set 存储无序的不可重复的数据 |-----HashSet,LinkedHashSet,TreeSet Map接口 存储-键值对的数据
 * |------HashMap,LinkedHashMap,HashTable【Properties】 ,TreeMap
 * 
 */
public class TestCollection {
	
	@Test
	public void testCollection3(){
		Collection coll = new ArrayList();
		coll.add(123);
		coll.add(new String("AA"));
		coll.add(new Date());
		coll.add("BB");
		 Person p = new Person("MM",23);
		coll.add(p);
		System.out.println(coll);
		
		Collection col=new ArrayList();
		col.add(123);
		col.add(new String("AA"));
		col.add(new Date());
		//判断两个集合是否相等
		System.out.println(col.equals(coll));
		//hashcode
		System.out.println(coll.hashCode());
		//toArray
		Object[] array = coll.toArray();
		System.out.println(array.length);
		
	}
	
	
	
	
	
	
	
	//@Test
	public void testCollection2() {
		Collection coll = new ArrayList();
		coll.add(123);
		coll.add(new String("AA"));
		coll.add(new Date());
		coll.add("BB");
		 Person p = new Person("MM",23);
		coll.add(p);
		System.out.println(coll);
		//6.contains判断集合中是否包含指定的元素，如果包含则返回true，不包含则返回false，判断依据是集合中包含对象的equals
		//如果是自定义类型，一定要重写equals
		boolean contains = coll.contains(new Person("MM",23));
		System.out.println(contains);
		System.out.println(coll.contains(new String("AA")));
		//7.containsAll判断一个集合中是否包含另一个集合的所有元素
		Collection col=Arrays.asList("AA","BB");
		System.out.println(coll.containsAll(col));
		System.out.println(coll);
		//8.remove移除object中的元素
		System.out.println(coll.remove(123));
		//9.从一个集合中移除另一个集合的所有元素
		System.out.println(coll.removeAll(col));
		System.out.println(coll);
		
		col=Arrays.asList(new Person("MM",23),"AA");
		//10.retainAll保留两个集合的交集
		System.out.println(coll.retainAll(col));
		System.out.println(coll);
		
	}

	//@Test
	public void testCollection1() {
		Collection coll = new ArrayList();
		// 1.返回集合中元素的个数
		System.out.println(coll.size());
		// 2.向集合中添加元素
		coll.add(123);
		coll.add("AA");
		coll.add(new Date());
		coll.add("BB");
		System.out.println(coll.size());
		// 3.将coll.addAll(coll)将coll集合添加到当前的集合中去
		coll.addAll(Arrays.asList(1, 2));
		System.out.println(coll.size());
		// 查看集合中的元素
		System.out.println(coll);
		// 4.判断集合是否为null
		boolean empty = coll.isEmpty();
		System.out.println(empty);
		// 5.清空集合
		coll.clear();
		empty = coll.isEmpty();
		System.out.println(empty);
	}

}
