package com.wjq.cn.collection.eg1;


public class Person implements Comparable {
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	/**
	 * 当我们需要将Person的实例添加到TreeMap中时我们需要Person实现Comparable接口
	 * ，首先对其进行年龄的比较，若年龄相等再进行姓名的比较
	 */
	@Override
	public int compareTo(Object o) {
		
		if(o instanceof Person){
			Person person=(Person)o;
			int i=this.age.compareTo(person.age);
			if(i==0){
				return this.name.compareTo(person.name);
			}
			return i;
			
		}
		return 0;
	}
	
}
