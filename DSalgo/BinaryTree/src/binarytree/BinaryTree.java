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
			str+="->"+node.left.data+"<-";
		}
		if(node.right==null) {
			str+=".";
		}else {
			str+="->"+node.right.data+"<-";
		}
		System.out.println(str);
		display(node.left);
		display(node.right);
	}
}
