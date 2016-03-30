package com.wjq.cn.designpatterns.iterator.me;

public class ArrayList implements Collection {
	private Object[] containers=new Object[10];
	private int size=0;
	
	public ArrayList() {
		
	}
	
	public void add(Object o){
		
		if(size>=containers.length){
			Object[] newcontainers=new Object[containers.length*2];
			System.arraycopy(containers, 0, newcontainers, 0, size);
			containers=newcontainers;
		}
		containers[size++]=o;
		
	}
	
	public Object get(int i){
		return containers[i];
	}
	
	public int size(){
		return size;
	}
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new ArrayListIterator();
	}
	
	
	class ArrayListIterator implements Iterator{
		int countIndex=0;
		@Override
		public boolean hasNext() {
			if(countIndex<size){
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			Object object = containers[countIndex];
			countIndex++;
			return object;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}

}


