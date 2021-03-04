package recursion;

import java.io.*;
import java.util.*;

public class PrintKPC {


	    public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
		    String str = sc.nextLine();
		    printKPC(str,"");
	    }
	    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	    
	    public static void printKPC(String str,String ans) {
	        if(str.length()==0){
	            System.out.println(ans);
	            return;
	        }
	        char ch= str.charAt(0);
	        String ros = str.substring(1);
	        
	        String codeOfCh = codes[ch-48];
	        
	        for(int i=0;i<codeOfCh.length();i++){
	            char charcode = codeOfCh.charAt(i);
	           printKPC(ros,ans+charcode);
	        }
	    }

	}