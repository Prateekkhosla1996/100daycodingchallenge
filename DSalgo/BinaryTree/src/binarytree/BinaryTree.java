package binarytree;

import java.util.*;

public class BinaryTree {
	Scanner sc = new Scanner(System.in);
	private class Node{
		int data;
		Node left;
		Node right;
	}
	private Node root;
	
	public BinaryTree() {
		root=takeInput(null,false);
	}

	private Node takeInput(Node parent, boolean ilc) {
		// TODO Auto-generated method stub
		/**
		 * if hlc is true that means we want to create left child
		 * if hrc is false that means we want to create right child
		 * hlc stands for has left child
		 * hrc stands for has right child 
		 * **/
		if(parent==null) {
			System.out.println("enter the data for root node ?");
		}else {
			if(ilc) {
				System.out.println("enter the data for left child of ?"+parent.data);
			}else {
				System.out.println("enter the data for right child of ?"+parent.data);
			}
		}
		int item = sc.nextInt();
		Node nn = new Node();
		nn.data=item;
		System.out.println(nn.data+"has left child?");
		boolean hlc =sc.nextBoolean();
		if(hlc) {
			nn.left=takeInput(nn, true);
		}
			
			System.out.println(nn.data+"has right child?");
			boolean hrc =sc.nextBoolean();
			if(hrc){
				nn.right=takeInput(nn, false);
			}
			return nn;
	}
	public void display() {
		display(root);
	}

	private void display(Node node) {
		if(node==null) {
			return;
		}
		String str="";
		if(node.left==null) {
			str+=".";
		}else {
			str+=node.left.data;
		}
		str+="->"+node.data+"<-";
		if(node.right==null) {
			str+=".";
		}else {
			str+=node.right.data;
		}
		System.out.println(str);
		display(node.left);
		display(node.right);
	}
	public void preorder() {
		preorder(root);
	}
	private void preorder(Node node) {
		if(node==null) {
			return;
		}
		System.out.println(node.data);
		preorder(node.left);
		preorder(node.right);
	}
	public void inorder() {
		inorder(root);
	}
	private void inorder(Node node) {
		if(node==null) {
			return;
		}
		inorder(node.left);
		System.out.println(node.data);
		inorder(node.right);
		
	}
	public void postorder() {
		postorder(root);
	}
	private void postorder(Node node) {
		if(node==null) {
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.println(node.data);
	}
	public int height() {
		return height(root);
	}
	private int height(Node node) {
		if(node==null) {
			return -1;
		}
		int lh=height(node.left);
		int rh=height(node.left);
		return Math.max(lh, rh)+1;
	}
	int diameterans =Integer.MIN_VALUE;
	public int diameter() {
		diameter(root);
		return diameterans;
	}

	private void diameter(Node root2) {
		if(root2==null) {
			return;
		}
		int presentnodeRoot = height(root2.left)+height(root2.left)+2;
		if(presentnodeRoot>diameterans) {
			diameterans=presentnodeRoot;
		}
		diameter(root2.left);
		diameter(root2.right);
	}
	public int diameter2() {
		return diameter2(root);
	}
	private int diameter2(Node node) {
		if(node==null) {
			return 0;
		}
		//max distance between 2 nodes might lie in left subtree
		int ld = diameter2(node.left);
		//max distance between 2 nodes might lie in right subtree
		int rd = diameter2(node.right);
		// self node might be the root node of diameter
		int sd = height(node.left)+height(node.right)+2;
		return Math.max(sd, Math.max(ld,rd));
	}
}
 