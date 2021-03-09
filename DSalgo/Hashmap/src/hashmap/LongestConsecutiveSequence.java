package hashmap;
import java.io.*;
import java.util.*;

public class LongestConsecutiveSequence {
	
	
	public static void main(String[] args) throws Exception {
	    // write your code here
	     Scanner sc = new Scanner(System.in);
			    int n1 = sc.nextInt();
			    int arr[]=new int[n1];
			    for(int i=0;i<arr.length;i++){
			        arr[i]=sc.nextInt();
			    }
			   
			   HashMap<Integer,Boolean> map = new HashMap<>();
			   for(int val:arr){
			       map.put(val,true);
			   }
			      
			   for(int val:arr){
			      if(map.containsKey(val-1)){
			          map.put(val,false);
			      }
			   }
			     int msp  = 0;
			     int ml = 0;
			     
			   for(int val:arr){
			      if(map.get(val)==true){
			          int templength=1;
			          int tempstartpoint=val;
			          while(map.containsKey(tempstartpoint+templength)){
			              templength++;
			          }
			          if(templength>ml){
			              msp=tempstartpoint;
			              ml=templength;
			          }
			      }
			   }
			   for(int i=0;i<ml;i++){
			       System.out.println(msp + i);
			   }
	 }

	}