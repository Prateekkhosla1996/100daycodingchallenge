package binarytree;

public class BinaryTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 70 false false 		
		BinaryTree bt = new BinaryTree();
		bt.display();
		System.out.println(bt.height());
		System.out.println(bt.diameter());
		System.out.println(bt.diameter2());
		bt.mirror();
		bt.display();
	}

}
