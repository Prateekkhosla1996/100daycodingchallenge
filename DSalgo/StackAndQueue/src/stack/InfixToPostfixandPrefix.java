package stack;
import java.io.*;

import java.util.Stack;
public class InfixToPostfixandPrefix {



	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String exp = br.readLine();

	    // code
	Stack<String> post = new Stack<>();
	Stack<String> pre = new Stack<>();
	Stack<Character> opts = new Stack<>();
	    for(int i=0;i<exp.length();i++){
	        char ch = exp.charAt(i);
	        
	        if(ch=='('){
	            opts.push(ch);
	            
	        }else if( (ch>='0'&&ch<='9')||(ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z') ){
	            pre.push(ch+"");
	            post.push(ch+"");
	            
	        }else if(ch==')'){
	            while(opts.peek()!='('){
	                char op = opts.pop();
	                String postV2 = post.pop();
	                String postV1 = post.pop();
	                String postv = postV1+postV2+op;
	                post.push(postv);
	                String preV2 = pre.pop();
	                String preV1 = pre.pop();
	                String prev = op+preV1+preV2;
	                pre.push(prev);
	                
	            }
	            opts.pop();
	            
	        }else if(ch=='*'||ch=='/'||ch=='+'||ch=='-'){
	            
	                while(opts.size()>0 && opts.peek()!='('&&precidence(ch)<=precidence(opts.peek()) ){
	                char op = opts.pop();
	                String postV2 = post.pop();
	                String postV1 = post.pop();
	                String postv = postV1+postV2+op;
	                post.push(postv);
	                String preV2 = pre.pop();
	                String preV1 = pre.pop();
	                String prev = op+preV1+preV2;
	                pre.push(prev);
	                
	            }
	            opts.push(ch);
	        }
	    }
	        while(opts.size()!=0){
	                char op = opts.pop();
	                String postV2 = post.pop();
	                String postV1 = post.pop();
	                String postv = postV1+postV2+op;
	                post.push(postv);
	                String preV2 = pre.pop();
	                String preV1 = pre.pop();
	                String prev = op+preV1+preV2;
	                pre.push(prev);
	            }
	            System.out.println(post.pop());
	            System.out.println(pre.pop());
	            
	 }
	 
	 public static int precidence(char ch){
	        if(ch=='+'){
	            return 1;
	        }else if(ch=='-'){
	            return 1;
	        }else if(ch=='*'){
	            return 2;
	        }
	        else if(ch=='/'){
	            return 2;
	        }else{
	            return 0;
	        }
	 }
	}
