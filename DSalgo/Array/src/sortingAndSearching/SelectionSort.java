package sortingAndSearching;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {64 ,25 ,12 ,22 ,11};
		display(arr);
		System.out.println();
		System.out.println("------------after sorting------------");
		selectionSort(arr);
		display(arr);
	}
	public static void selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int min_Idx = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min_Idx]) {
					min_Idx = j;
				}
			}
					int temp = arr[min_Idx];
					arr[min_Idx] = arr[i];
					arr[i] = temp;
				
			
		}
		
	}
	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
