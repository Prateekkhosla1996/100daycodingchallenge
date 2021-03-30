package Array;

public class BarGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,2,1,0,8};
		barGraph(arr);

	}
	public static void barGraph(int arr[]) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		for(int floor= max ; floor>=1;floor--) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>=floor) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
