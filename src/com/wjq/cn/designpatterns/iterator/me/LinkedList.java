package com.wjq.cn.designpatterns.iterator.me;


public class LinkedList implements Collection{
	//链表的头
	private Node head;
	//链表的尾
	private Node tail;
	
	private int size=0;
	
	public LinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	public void add(Object o){
		Node node=new Node(o, null);
		if(head==null){//链表为null时，头和尾都为null
			head=node;
			tail=node;
		}
		else {
			tail.setNextNode(node);
			tail=node;
		}
		size++;
		
	}
	
	public int size(){
		return size;
	}
	
	public Object get(int k){
		Node x=head;
		for(int i=0;i<k;i++){
			x=x.getNextNode();
			return x.getData();
		}
		return x.getData();
	}
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
class Node{
	private Object data;
	private Node nextNode;
	
	
	
	public Node(Object data, Node nextNode) {
		super();
		this.data = data;
		this.nextNode = nextNode;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	class LinkedListIterator implements Iterator{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}

	
}


