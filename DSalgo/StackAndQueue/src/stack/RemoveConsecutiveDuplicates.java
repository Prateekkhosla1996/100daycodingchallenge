package stack;

import java.util.Stack;

public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbccbcd";
		System.out.println(removeConsecutiveDuplicates(str));

	}
	 public static String removeConsecutiveDuplicates(String str){
	     String res ="";
	     Stack<Character> ch = new Stack<>();
	     
	     for(int i=0;i<str.length();i++) {
	    	 
	    	 if(ch.isEmpty()||ch.peek()!=str.charAt(i)) {
	    		 ch.push(str.charAt(i));
	    	 }
	     }
	     while(!ch.isEmpty()) {
	    	 res=ch.peek()+res;
	    	 ch.pop();
	     }
	     return res;
	    }
}
