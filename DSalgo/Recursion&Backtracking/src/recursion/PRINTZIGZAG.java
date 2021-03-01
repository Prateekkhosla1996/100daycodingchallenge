package recursion;
import java.io.*;
import java.util.*;

public class PRINTZIGZAG {

	    public static void main(String[] args) throws Exception {
	        // write your code here
	          Scanner sc = new Scanner(System.in);
					 int x = sc.nextInt();
					 pzz(x);
	    }

	    public static void pzz(int n){
	        if(n==0){
	            return;
	        }
	        System.out.print(n+" ");
	        pzz(n-1);
	        System.out.print(n+" ");
	        pzz(n-1);
	        System.out.print(n+" ");
	    }

	}