package Array;
import java.util.*;
public class WaveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static void convertToWave(int arr[], int n){
	     Arrays.sort(arr);
	     for(int i=0;i<n-1;i+=2){
	         int temp = arr[i];
	         arr[i] = arr[i+1];
	         arr[i+1]=temp;
	     }
	    }
}
