package stack;

import java.util.Stack;

public class BPpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="[{(()}]";
		System.out.println(bp(str));

	}
	public static boolean bp(String str) {
		Stack<Character> st = new Stack<>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='('||ch=='{'||ch=='[') {
				st.push(ch);
			}
			if(ch==')') {
				boolean val = handleClosing(st, '(');
				if(val==false) {
					return val;
				}
			}
			if(ch=='}') {
				boolean val = handleClosing(st, '{');
				if(val==false) {
					return val;
				}
			}
			if(ch==']') {
				boolean val = handleClosing(st, '[');
				if(val==false) {
					return val;
				}
			}
			
		}
		return st.isEmpty();
	}
	public static boolean handleClosing(Stack<Character> st, char ch) {
		if(st.size()==0) {
			return false;
		}
		if(st.peek()!=ch) {
			return false;
		}else{
			st.pop();
			return true;
		}
	}

}
