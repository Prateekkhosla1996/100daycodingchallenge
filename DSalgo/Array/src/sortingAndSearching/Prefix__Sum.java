package sortingAndSearching;

public class Prefix__Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int preFix [] = prefix__sum(arr);
		display(preFix);
	}

	public static int[] prefix__sum(int[] arr) {
		int ans []=new int[arr.length];
		ans[0] = arr[0];
		for(int i=1;i<arr.length;i++) {
			ans[i] = ans[i-1]+arr[i];
		}
		return ans;
	}
	

	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
}
