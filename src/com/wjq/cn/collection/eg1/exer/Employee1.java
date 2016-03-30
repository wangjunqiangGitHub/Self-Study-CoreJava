package com.wjq.cn.collection.eg1.exer;
/**
 * 
*  @author  wjq  
*  @ClassName  : Employee  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016��2��19�� ����3:06:30
*  
*   ����һ��Employee�࣬
	���������private��Ա����name,age,birthday������ birthday Ϊ MyDate ��Ķ���
	��Ϊÿһ�����Զ��� getter, setter ������
	����д toString ������� name, age, birthday

 */
public class Employee1 {
	private String name;
	private Integer age;
	private MyDate birthday;
	
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee1(String name, Integer age, MyDate birthday) {
		super();
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}

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
	public MyDate getBirthday() {
		return birthday;
	}
	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", birthday="
				+ birthday + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result
				+ ((birthday == null) ? 0 : birthday.hashCode());
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
		Employee1 other = (Employee1) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	
	
	
	
	
	
	
	
	

}
