package stack;

import java.io.*;
import java.util.*;
import java.util.Stack;

public class InfixEval {
 

	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String exp = br.readLine();

	    // code
	    Stack <Integer> oprands = new Stack <>();
	    Stack <Character> operators = new Stack <>();
	    
	     for(int i=0;i<exp.length();i++) {
		    	char ch = exp.charAt(i);
		    	
		    	if(ch=='('){
		    	    operators.push(ch);
		    	}else if(Character.isDigit(ch)){
		    	    oprands.push(ch-'0');
		    	}else if(ch==')'){
		    	    while(operators.peek()!='('){
		    	       char popEle = operators.pop();
		    	       int v2 = oprands.pop();
		    	       int v1 = oprands.pop();
		    	       
		    	       int optv = operations(v1,v2,popEle);
		    	       oprands.push(optv);
		    	    }
		    	    operators.pop();
		    	}else if(ch=='*'||ch=='/'||ch=='+'||ch=='-'){
		    	    while(operators.size()>0 &&operators.peek()!='('&& precidence(ch)<=precidence(operators.peek())){
		    	         char popEle = operators.pop();
		    	       int v2 = oprands.pop();
		    	       int v1 = oprands.pop();
		    	       
		    	       int optv = operations(v1,v2,popEle);
		    	       oprands.push(optv);
		    	    }
		    	    operators.push(ch);
		    	}
	     }
	     
	     while(operators.size()!=0){
		    	       char popEle = operators.pop();
		    	       int v2 = oprands.pop();
		    	       int v1 = oprands.pop();
		    	       
		    	       int optv = operations(v1,v2,popEle);
		    	       oprands.push(optv);
		    	    }
	    
	    System.out.println(oprands.peek());
	 }
	 public static int precidence(char opt){
	     if(opt=='+'){
	         return 1;
	     }
	     else if(opt=='-'){
	         return 1;
	     }
	     if(opt=='*'){
	         return 2;
	     }else{
	         return 2;
	     }
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