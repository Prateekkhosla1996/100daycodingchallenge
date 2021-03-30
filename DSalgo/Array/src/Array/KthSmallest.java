package Array;

import java.util.Arrays;

public class KthSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7, 10, 4, 3, 20, 15} ;
		int k = 3 ;
		System.out.println(kthSmallest(arr, k));
	}
	
	public static int kthSmallest(int arr[],int k) {
		Arrays.sort(arr);
		
		return arr[k-1];
	}

}
