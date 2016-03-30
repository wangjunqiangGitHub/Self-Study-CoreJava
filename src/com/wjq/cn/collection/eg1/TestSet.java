package com.wjq.cn.collection.eg1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

/**
 * 
*  @author  wjq  
*  @ClassName  : TestSet  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年2月18日 下午4:58:58
*  
*  Collection集合接口
*  	|-------List接口
* 			|-----ArrayList：适用于频繁的访问
* 			|-----LinkedList：适用于频繁的插入删除
* 			|-----Vector：是线程安全的，效率低于ArrayList
*  			
*  	|-------Set接口  ：存储的都是无序的不可重复的元素，常用的方法都是Collection集合下的
*  			|-----HashSet：主要的实现类
*  			|-----LinkedHashSet
*  			|-----TreeSet
*  
 */
public class TestSet {
	
	@Test
	public void  test5(){
		Set set=new TreeSet<>(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Customer && o2 instanceof Customer){
					Customer c1=(Customer) o1;
					Customer c2=(Customer) o2;
					int i=c1.getId().compareTo(c2.getId());
					if(i==0){
						return c1.getName().compareTo(c2.getName());
					}
					return i;
				}
				return 0;
			}
		});
		
		set.add(new Customer("DD", 10));
		set.add(new Customer("BB", 11));
		set.add(new Customer("AA", 20));
		for (Object object : set) {
			System.out.println(object);
		}
		
		
		
	}
	
	/**
	 * TreeSet定制排序
	 */
	@Test
	public void test4(){
		Comparator comparator=new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Customer && o2 instanceof Customer){
					Customer c1=(Customer) o1;
					Customer c2=(Customer) o2;
					int i=c1.getId().compareTo(c2.getId());
					if(i==0){
						return c1.getName().compareTo(c2.getName());
					}
					return i;
				}
				return 0;
			}
		};
		
		Set set=new TreeSet<>(comparator);
		set.add(new Customer("DD", 10));
		set.add(new Customer("BB", 11));
		set.add(new Customer("AA", 20));
		for (Object object : set) {
			System.out.println(object);
		}
		
		
		
		
		
	}
	
	
	
	
	
	/**
	 * TreeSet
	 * ❶TreeSet中只能添加同一个类型的元素
	 * ❷TreeSet集合中的元素可以按照指定的顺序进行遍历，像Integer类型的我们可以默认的从大到小进行排序
	 * ❸在向TreeSet中添加元素时可以指定排序的规则，自然排序和定制排序
	 * ❹当向TreeSet中添加元素没有实现排序接口时，并且添加不同类型的数据时会报ClassCastException
	 * 
	 */
	@Test
	public void test3(){
		Set set=new TreeSet();
		/*set.add("AAA");
		set.add("BB");
		set.add(123);*/
		//当Person不实现Comparable是，向TreeSet中添加元素会报ClassCastException
		set.add(new Person("AA", 20));
		set.add(new Person("BB", 90));
		set.add(new Person("CC", 100));
		set.add(new Person("FF", 60));
		set.add(new Person("EE", 20));
		for (Object object : set) {
			System.out.println(object);
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	/**
	 * LinkedHashSet:
	 * 	LinkedHashSet底层是通过LinkedHashMap来实现的
	 *  它的效率要低于HashSet，但是在迭代set集合中的元素时要快于HashSet
	 */
	@Test
	public void test2(){
		Set set=new LinkedHashSet<>();
		set.add(null);
		set.add(123);
		set.add("AA");
		set.add("AA");
		for (Object object : set) {
			System.out.println(object);
		}
	}
	
	
	/**
	 * Set存储的元素是“无序的，不可重复的！”
	 * ❶无序性：无序性！=随机性  ，无序性指的是元素在底层存储的位置是无序的
	 * ❷不可重复：当向set中添加元素时后面有两个相同的时，后面的这个是添加不进去的
	 * 说明：当向set中添加元素的时候，一定要保证添加的元素的类要重写equals和hashcode，从而保证添加元素的唯一性
	 * HashSet元素底层是通过HashMap存储的，它存储的时元素的key
	 * 
	 * 注意：一定要保证equals和hashcode的一致性
	 * 
	 * 
	 */
	@Test
	public void test1(){
		Set set=new HashSet();
		set.add(123);
		set.add(456);
		set.add(null);
		set.add(new String("AA"));
		set.add(new String("AA"));
		set.add("BB");
		Person p1=new Person("GG", 23);
		Person p2=new Person("GG", 23);
		set.add(p1);
		set.add(p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		for (Object object : set) {
			System.out.println(object);
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
