package Array;
import java.io.*;
import java.util.*;

public class FindElement {

	public static void main(String[] args) throws Exception {
	    // write your code here
	     Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    
		    for(int i=0;i<arr.length;i++){
		        arr[i]=sc.nextInt();
		    }
		    int x = sc.nextInt();
		    System.out.println(find(arr,x));
	 }
	    public static int find(int arr[],int x){
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]==x){
	                return i;
	            }
	        }
	        return -1;
	    }
	}