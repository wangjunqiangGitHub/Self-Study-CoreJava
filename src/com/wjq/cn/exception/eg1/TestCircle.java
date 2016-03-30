package com.wjq.cn.exception.eg1;

/**
 * �ֶ��׳�һ���쳣 ��.���׳�����RuntimeException����Ҫ��ʾ�Ĵ������׳�����Exception�� ��Ҫ��ʾ�Ĵ���
 */
public class TestCircle {
	public static void main(String[] args) {
		Circle c1=new Circle(2);
		Circle c2=new Circle(2);
		try {
			System.out.println(c1.compareTo(c2));
			System.out.println(c1.compareTo(new String("A")));
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Circle {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public int compareTo(Object o) throws MyException {
		// TODO Auto-generated method stub
		if (null == o) {
			throw new MyException("����ȽϵĶ���Ϊnull��");
		}
		if (o == this) {
			return 0;
		} else if (o instanceof Circle) {
			Circle circle = (Circle) o;
			if (this.radius > circle.radius) {
				return 1;
			} else if (this.radius == circle.radius) {
				return 0;
			} else {
				return -1;
			}
		} else {
			//�ֶ��׳�һ���쳣
			throw new MyException("����Ķ������Ͳ�ƥ��");
		}

	}

}
