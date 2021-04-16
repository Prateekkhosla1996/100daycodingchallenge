package Array;
import java.util.*;
public class MeanMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int median(int arr[],int N)
    {
      
       Arrays.sort(arr);
       int res = 0;
        if(N%2==0){
            res = (arr[N/2]+arr[(N/2)-1])/2;
            return res;
        }
        
            return arr[N/2];
        
    }
    //Function to find median of the array elements.
    public int mean(int arr[],int N)
    {
       //Your code here
       int res = 0;
       for(int i=0;i<N;i++){
           res+=arr[i];
       }
       return (res/N);
    }

}
