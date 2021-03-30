package Array;
import java.io.*;
import java.util.*;

public class RotateArrayK {
	
	  public static void display(int[] a){
	    StringBuilder sb = new StringBuilder();

	    for(int val: a){
	      sb.append(val + " ");
	    }
	    System.out.println(sb);
	  }
	public static void reverse(int[] arr, int li, int ri){
		    int i = li;
		    int j= ri;
		    while(i<j){
		        int temp = arr[i];
		        arr[i]=arr[j];
		        arr[j]=temp;
		        i++;
		        j--;
		    }
		  }
	  public static void rotate(int[] a, int k){
	      k=k%a.length;
	      if(k<0){
	          k+=a.length;
	      }
	    // write your code here
	    // part 1 reverse
	    reverse(a,0,a.length-k-1);
	    // part 2 reverse
	    reverse(a,a.length-k,a.length-1);
	    // whole array reverse
	    reverse(a,0,a.length-1);
	  }
	    


	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }
	    int k = Integer.parseInt(br.readLine());

	    rotate(a, k);
	    display(a);
	 }

	}