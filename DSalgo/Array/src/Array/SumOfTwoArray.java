package Array;
import java.io.*;
import java.util.*;

public class SumOfTwoArray {
	
	public static void main(String[] args) throws Exception {
	    // write your code here
	     Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    
		    int arr1[] = new int[n];
			    for(int i=0;i<arr1.length;i++){
			        arr1[i]=sc.nextInt();
			    }
			int m = sc.nextInt();
		    
		    int arr2[] = new int[m];
			    for(int i=0;i<arr2.length;i++){
			        arr2[i]=sc.nextInt();
			    }
			    
			 int sum[]=new int[n>m?n:m];
			 int c = 0;
			 int i = arr1.length-1;
			 int j = arr2.length-1;
			 int k= sum.length-1;
			 
			 while(k>=0){
			     int digit =c;
			     if(i>=0){
			         digit+=arr1[i];
			     }
			     if(j>=0){
			         digit+=arr2[j];
			     }
			     
			     c=digit/10;
			     digit=digit%10;
			     
			     sum[k]=digit;
			     i--;
			     j--;
			     k--;
			     
			     
			 }
			 if(c!=0){
			     System.out.println(c);
			 }
			 for(int val:sum){
			     System.out.println(val);
			 }
	 }

	}