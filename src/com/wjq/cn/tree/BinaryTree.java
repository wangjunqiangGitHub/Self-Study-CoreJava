package com.wjq.cn.tree;

public class BinaryTree {

	private Node root;
	
	/**
	 * 
	 * �ڲ��ڵ���
	 * @author yhh
	 */
	private class Node{
		private Node left;
		private Node right;
		private int data;
		public Node(int data){
			this.left = null;
			this.right = null;
			this.data = data;
		}
	}
	
	public BinaryTree(){
		root = null;
	}
	
	/**
	 * �ݹ鴴��������
	 * @param node
	 * @param data
	 */
	public void buildTree(Node node,int data){
		if(root == null){
			root = new Node(data);
		}else{
			if(data < node.data){
				if(node.left == null){
					node.left = new Node(data);
				}else{
					buildTree(node.left,data);
				}
			}else{
				if(node.right == null){
					node.right = new Node(data);
				}else{
					buildTree(node.right,data);
				}
			}
		}
	}
	
	/**
	 * ǰ�����
	 * @param node
	 */
	public void preOrder(Node node){
		if(node != null){
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
		if(node != null){
			inOrder(node.left);
			System.out.print(node.data+",");
			inOrder(node.right);
		}
	}
	
	/**
	 * �������
	 * @param node
	 */
	public void postOrder(Node node){
		if(node != null){
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.data+",");
		}
	}
	
	public static void main(String[] args) {
		int[] a = {2,4,12,45,21,6,111};
		BinaryTree bTree = new BinaryTree();
		for (int i = 0; i < a.length; i++) {
			bTree.buildTree(bTree.root, a[i]);
		}
		bTree.preOrder(bTree.root);
		System.out.println();
		bTree.inOrder(bTree.root);
		System.out.println();
		bTree.postOrder(bTree.root);
	}

}
