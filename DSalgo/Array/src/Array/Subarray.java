package Array;
import java.io.*;
import java.util.*;

public class Subarray {
	
	public static void main(String[] args) throws Exception {
	    // write your code here
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    int arr[] = new int[n];
		    for(int i=0;i<arr.length;i++){
		        arr[i]=sc.nextInt();
		    }
		    for(int i=0;i<arr.length;i++){
		        for(int j = i;j<arr.length;j++){
		            for(int k=i;k<=j;k++){
		                System.out.print(arr[k]+"\t");
		            }
		            System.out.println();
		        }
		    }
	 }

	}