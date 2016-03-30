package com.wjq.cn.tree;
/**
 * 
*  @author  wjq  
*  @ClassName  : BinaryTree2  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年2月26日 下午1:47:39
*  使用递归的方式创建二叉树，并对其进行前，中，后序遍历
 */
public class BinaryTree2 {
	private Node root;
	/**
	 * 创建节点内部类
	 */
	private class Node{
		//左子节点
		private Node left;
		//右子节点
		private Node right;
		//节点的数据
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
	 * 创建二叉树
	 * @param node
	 * @param data
	 */
	public void buildTree(Node node,int data){
		if(root==null){
			//创建根节点
			root=new Node(data);
		}else {
			if(data<node.data){//给左子树添加子节点
				if(node.left==null){
					node.left=new Node(data);
				}else {
					//递归深入
					buildTree(node.left, data);
				}
			}else {//给右节点添加子节点
				if(node.right==null){
					node.right=new Node(data);
				}else {
					buildTree(node.right, data);
				}
			}
		}
	}
	
	/**
	 * 前序遍历二叉树
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
	 * 中序遍历
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
	 * 后续遍历
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
