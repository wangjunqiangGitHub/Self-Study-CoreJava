package com.wjq.cn.collection.eg1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

/**
 * 
*  @author  wjq  
*  @ClassName  : TestMap  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年2月18日 上午10:19:34
*  
*  
*  Map接口
*  		|-------HashMap:Map接口的主要的实现类
*  		|-------LinkedHashMap:使用链表维护添加进Map中元素的顺序，故便利Map时是按照添加元素的顺序遍历的
*  		|-------TreeMap:按照添加进Map中元素的key的指定属性进行排序，要求key必须是【同一个类的对象】
*  						对于key来说：自然排序VS定制排序
*  		|-------Hashtable：是古老的map接口的实现，在jdk1.0就出现了，它是线程安全的，不推荐使用
*  				|------Properties：用来处理属性配置文件，key和value都是String类型的。
 */
public class TestMap {
	
	/**
	 * 使用Properties读取配置文件
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@Test
	public void test5() throws FileNotFoundException, IOException{
		Properties properties=new Properties();
		System.out.println(TestMap.class.getResource("").getPath());
		properties.load(new FileInputStream(new File(TestMap.class.getResource("").getPath()+"jdbc.properties")));
		String username = properties.getProperty("username");
		String password=properties.getProperty("password");
		System.out.println(username+","+password);
		
		
	}
	
	
	
	
	
	/**
	 * TreeMap的定制排序
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
		
		TreeMap map=new TreeMap<>(comparator);
		map.put(new Customer("AA", 60), 20);
		map.put(new Customer("BB", 40), 90);
		map.put(new Customer("CC", 20), 30);
		map.put(new Customer("DD", 80), 50);
		map.put(new Customer("EE", 90), 10);
		
		Set keySet = map.keySet();
		for (Object object : keySet) {
			System.out.println(object+"---->"+map.get(object));
		}
		
		
		
		
		
		
	}
	
	
	
	
	/**
	 * TreeMap的自然排序
	 */
	@Test
	public void test3(){
		Map map=new TreeMap<>();
		map.put(new Person("JJ", 20), 90);
		map.put(new Person("BB", 40), 60);
		map.put(new Person("DD", 10), 40);
		map.put(new Person("AA", 50), 80);
		
		Set entrySet = map.entrySet();
		for (Object object : entrySet) {
			System.out.println(object);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	@Test
	public void test2(){
		Map map = new HashMap();
		map.put("AA", 213);
		map.put("BB", 45);
		map.put(123, "CC");
		map.put(null, null);
		map.put(new Person("DD", 23), 89);
		//遍历key
		Set keySet = map.keySet();
		for (Object object : keySet) {
			System.out.println(object);
		}
		//遍历value
		Collection values = map.values();
		for (Object object : values) {
			System.out.println(object);
		}
		Iterator iterator = values.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
		//遍历key——value
		Set entrySet = map.entrySet();
		for (Object object : entrySet) {
			Entry entry=(Entry)object;
			System.out.println(entry);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	@Test
	public void test1(){
		Map map=new HashMap();
		map.put("AA", 123);
		map.put("BB", 456);
		map.put("BB", 45);
		map.put(null, null);
		map.put(new Person("AA", 20), 20);
		map.put(new Person("AA", 20), 21);
		System.out.println(map);
		map.remove("BB");
		System.out.println(map);
		Object object = map.get("AA");
		System.out.println(object);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
