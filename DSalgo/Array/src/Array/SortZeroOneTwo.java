package Array;

public class SortZeroOneTwo {

	public static int[] sort(int arr[]) {
		int low=0;
		int mid=0;
		int hi=arr.length-1;
		while(mid<=hi) {
			if(arr[mid]==0) {
				swap(arr,low,mid);
				low++;
				mid++;
			}else if(arr[mid]==1) {
				
				mid++;
			}else {
				swap(arr,mid,hi);
				hi--;
			}
		}
		return arr;
	}
	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void swap(int [] arr,int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,0,2,1,0,2};
		int ans[]=sort(arr);
		display(ans);
		
	}

}
