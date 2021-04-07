package stack;

import java.util.Stack;

public class PrefixEvalConv {

	public static void main(String args[]) {
		String exp = "-+2/*6483";
		Stack<String> post = new Stack<>();
		Stack<Integer> val = new Stack<>();
		Stack<String> in = new Stack<>();
		
		
		for(int i=exp.length()-1;i>=0;i--) {
			char ch = exp.charAt(i);
			
			if(ch=='/'||ch=='*'||ch=='+'||ch=='-') {
	        	int v1 = val.pop();
	        	int v2 = val.pop();
	        	int value = operations(v1,v2,ch);
	        	val.push(value);
	        	 String vpo1 = post.pop();
	        	 String vpo2 = post.pop();
	        	 String valuepo = vpo1+vpo2+ch;
	        	 post.push(valuepo);
	        	 String vin1 = in.pop();
	        	 String vin2 = in.pop();
	        	 String valuein = "("+vin1+ch+vin2+")";
	        	 in.push(valuein);
	        }
			else{
	            in.push(ch+"");
	            post.push(ch+"");
	            val.push(ch-'0');
	        } 
		}
		System.out.println(val.pop());
		System.out.println(in.pop());
		System.out.println(post.pop());
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
