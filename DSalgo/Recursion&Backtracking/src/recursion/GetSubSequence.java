package recursion;

import java.io.*;
import java.util.*;

public class GetSubSequence {

	    public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        ArrayList<String> res = gss(str);
	        System.out.println(res);
	    }

	    public static ArrayList<String> gss(String str) {
	     if(str.length()==0){
	          ArrayList<String> br= new ArrayList<>();
	          br.add("");
	          return br;
	     }
	     char ch = str.charAt(0); //a
	     String ros = str.substring(1); //bc
	     
	     ArrayList<String> rres = gss(ros); 
	     
	     ArrayList<String> myres = new ArrayList<>();
	     for(String rstr:rres){
	         myres.add(""+rstr);
	     }
	     for(String rstr:rres){

	         myres.add(ch+rstr);
	     }
	        return myres;
	    }

	}