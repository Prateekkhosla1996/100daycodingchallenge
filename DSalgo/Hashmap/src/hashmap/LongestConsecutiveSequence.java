package hashmap;
import java.io.*;
import java.util.*;
/*1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print the longest sequence of consecutive elements in the array (ignoring duplicates).

Note -> In case there are two sequences of equal length (and they are also the longest), then print the one for which the starting point of which occurs first in the array.
Input Format
A number n
n1
n2
.. n number of elements
Output Format
Elements of longest sequence of consecutive elements of array in separate lines (ignoring duplicates)
Sample Input
17
12
5
1
2
10
2
13
7
11
8
9
11
8
9
5
6
11
Sample Output
5
6
7
8
9
10
11
 * */
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