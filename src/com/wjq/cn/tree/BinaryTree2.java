package com.wjq.cn.tree;
/**
 * 
*  @author  wjq  
*  @ClassName  : BinaryTree2  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016��2��26�� ����1:47:39
*  ʹ�õݹ�ķ�ʽ���������������������ǰ���У��������
 */
public class BinaryTree2 {
	private Node root;
	/**
	 * �����ڵ��ڲ���
	 */
	private class Node{
		//���ӽڵ�
		private Node left;
		//���ӽڵ�
		private Node right;
		//�ڵ������
		private int data;
		
		public Node(int data){
			this.left=null;
			this.right=null;
			this.data=data;
		}
	}
	
	
	public BinaryTree2(){
		root=null;
	}
	
	/**
	 * ����������
	 * @param node
	 * @param data
	 */
	public void buildTree(Node node,int data){
		if(root==null){
			//�������ڵ�
			root=new Node(data);
		}else {
			if(data<node.data){//������������ӽڵ�
				if(node.left==null){
					node.left=new Node(data);
				}else {
					//�ݹ�����
					buildTree(node.left, data);
				}
			}else {//���ҽڵ�����ӽڵ�
				if(node.right==null){
					node.right=new Node(data);
				}else {
					buildTree(node.right, data);
				}
			}
		}
	}
	
	/**
	 * ǰ�����������
	 * @param node
	 */
	public void preOrder(Node node){
		if(node!=null){
			System.out.print(node.data+",");
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	
	/**
	 * �������
	 * @param node
	 */
	public void inOrder(Node node){
		if(node!=null){
			inOrder(node.left);
			System.out.print(node.data+",");
			inOrder(node.right);
		}
	}
	
	/**
	 * ��������
	 * @param node
	 */
	public void postOrder(Node node){
		if(node!=null){
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.data+",");
		}
	}
	
	public static void main(String[] args) {
		int[] a = {2,4,12,45,21,6,111};
		BinaryTree2 tree=new BinaryTree2();
		for (int i = 0; i < a.length; i++) {
			tree.buildTree(tree.root, a[i]);
		}
		tree.preOrder(tree.root);
		System.out.println();
		tree.inOrder(tree.root);
		System.out.println();
		tree.postOrder(tree.root);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
