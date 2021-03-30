package Array;
import java.util.*;
public class kthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,7,8,2,3,0,2};
		int k =3;
		System.out.println(kthLargest(arr, k));
		
	}
	public static int kthLargest(int arr[],int k) {
		Arrays.sort(arr);
		reverse(arr);
		return arr[k-1];
	}
	public static void reverse(int arr[]) {
		int i = 0;
		int j = arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j]=temp;
			i++;j--;
		}
	}
}
