package Array;
import java.io.*;
import java.util.*;

public class span {


	public static void main(String[] args) throws Exception {
	    // write your code here
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    for(int i=0;i<arr.length;i++){
	        arr[i]=sc.nextInt();
	    }
	    
	    System.out.println(span(arr));
	}
	    public static int span(int arr[]){
	        int max = arr[0];
	        int min = arr[0];
	        
	        for(int i=0;i<arr.length;i++){
	            if(max<arr[i]){
	                max=arr[i];
	            }
	            if(min>arr[i]){
	                min = arr[i];
	            }
	        }
	        return max-min;
	    }
	}