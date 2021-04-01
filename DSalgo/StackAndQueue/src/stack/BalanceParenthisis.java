package stack;
import java.util.Stack;
public class BalanceParenthisis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "{([}])}";
		System.out.println(balanceParenthisis(str));
	}

	public static boolean balanceParenthisis(String str) {
		Stack <Character> st =new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='{'||ch=='('||ch=='[') {
				st.push(ch);
			}
			else if(ch=='}') {
				boolean val = handleClosing(st, '{');
				if(val==false) {
					return false;
				}
			}
			else if(ch==']') {
				boolean val = handleClosing(st, '[');
				if(val==false) {
					return false;
				}
			}
			else if(ch==')') {
				boolean val = handleClosing(st, '(');
				if(val==false) {
					return false;
				}
			}
		
		}
		return st.isEmpty();
		
		
	}
	
	public static boolean handleClosing(Stack<Character>st,char ch) {
		if(st.size()==0) {
		return false;
		}
		else if(st.peek()!=ch) {
			return false;
		}else {
			st.pop();
			return true;
		}
	}
}
