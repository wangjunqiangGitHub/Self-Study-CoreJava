package com.wjq.cn.extend.eg1;

public class Circle extends GeometricObject {
	private Double radius;
	
	public Circle(){
		super();
		this.radius=1.0;
	}
	
	public Circle(Double radius){
		super();
		this.radius=radius;
	}

	public Circle(Double radius,String color,Double weight ){
		super(color,weight);
		this.radius=radius;
	}
	
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((radius == null) ? 0 : radius.hashCode());
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
		Circle other = (Circle) obj;
		if (radius == null) {
			if (other.radius != null)
				return false;
		} else if (!radius.equals(other.radius))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	

}
