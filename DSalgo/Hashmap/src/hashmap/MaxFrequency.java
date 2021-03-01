package hashmap;
import java.io.*;
import java.util.*;


public class MaxFrequency {

	    public static void main(String[] args) throws Exception {
	        // write your code here
	        Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        HashMap<Character,Integer> compress =new HashMap<>();
	        for(int i=0;i<str.length();i++){
	            char ch =str.charAt(i);
	            if(compress.containsKey(ch)){
	                int of = compress.get(ch);
	                int nf = of+1;
	                compress.put(ch,nf);
	            }
	            else{
	                compress.put(ch,1);
	            }
	        }
	        
	        char mfc = str.charAt(0);
	        for(Character key:compress.keySet()){
	            if(compress.get(key)>compress.get(mfc)){
	                mfc=key;
	            }
	        }
	        System.out.println(mfc);
	    }

	}