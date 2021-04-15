package Array;

import java.util.ArrayList;

public class MinMaxElement {

	public static ArrayList<Integer> minMax(int arr[]){
	ArrayList<Integer> res = new ArrayList<Integer>();
	int max =Integer.MIN_VALUE;
	int smax = Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			smax = max;
			max = arr[i];
		}else if(arr[i]>smax&&arr[i]!=max) {
			smax = arr[i];
		}
	}
	if(smax==Integer.MIN_VALUE) {
		smax = -1;
	}
	res.add(max);
	res.add(smax);
	
	return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {200,100,200,3000,2000,2000,2000,2000};
		System.out.println(minMax(arr));
	}

}
