package sortingAndSearching;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,5,4,7,1,12,22,6};
		display(arr);
		System.out.println("------------after sorting------------");
		bubbleSort(arr);
		display(arr);
	}
	
	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void bubbleSort(int arr[]) {
		for(int i = 0;i < arr.length;i++) {
			for(int j= i + 1;j < arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
