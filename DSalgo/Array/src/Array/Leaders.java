package Array;
import java.util.*;
public class Leaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static ArrayList<Integer> leaders(int arr[], int n){
	       
	       ArrayList<Integer> ans = new ArrayList<>();
	       int prev = arr[arr.length-1];
	       ans.add(arr[arr.length-1]);
	       
	       for(int i=arr.length-2;i>=0;i--){
	           if(arr[i]>=prev){
	               prev = arr[i];
	               ans.add(arr[i]);
	           }
	       }
	       Collections.sort(ans, Collections.reverseOrder());
	       return ans;
	    }

}
