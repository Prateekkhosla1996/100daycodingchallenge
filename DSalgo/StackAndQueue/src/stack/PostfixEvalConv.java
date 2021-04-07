package stack;

import java.util.Stack;

public class PostfixEvalConv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "264*8/+3-";
		
		Stack<Integer> val = new Stack<>();
		Stack<String> in = new Stack<>();
		Stack<String> pre = new Stack<>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='/'||ch=='+'||ch=='-'||ch=='*') {
				int val2 = val.pop();
				int val1 = val.pop();
				int valueVal = operations(val1, val2, ch);
				val.push(valueVal);
				String v2in = in.pop();
				String v1in = in.pop();
				String valueIn = "("+v1in+ch+v2in+")";
				in.push(valueIn);
				String v2pre = pre.pop();
				String v1pre = pre.pop();
				String valuePre = ch+v1pre+v2pre;
				pre.push(valuePre);
			}else {
				val.push(ch-'0');
				in.push(ch+"");
				pre.push(ch+"");
			}
			
			
		}
		System.out.println(val.pop());
		System.out.println(pre.pop());
		System.out.println(in.pop());
	}
	public static int operations(int v1, int v2, char opt){
	       if(opt=='+'){
	         return v1+v2;
	     }
	     else if(opt=='-'){
	         return v1-v2;
	     }
	     if(opt=='*'){
	         return v1*v2;
	     }else{
	         return v1/v2;
	     }
	 }

}
