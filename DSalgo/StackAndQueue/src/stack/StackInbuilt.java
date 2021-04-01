package stack;

import java.util.Stack;

public class StackInbuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		Stack<Integer> st1 = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		while(!st.isEmpty()) {
			int popelement = st.pop();
			st1.push(popelement);
		}
		System.out.println(st1);
	}

}
