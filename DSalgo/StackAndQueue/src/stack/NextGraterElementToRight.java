package stack;

import java.util.Stack;

public class NextGraterElementToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {5,3,8,-2,7};
		
		int ans[] = nextGraterElementToRight(arr);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}
	public static int[] nextGraterElementToRight(int[] arr) {
		int ans [] = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		st.push(arr[arr.length-1]);
		ans[arr.length-1]=-1;
		for(int i=arr.length-2;i>=0;i--) {
			while(st.size()>0 &&arr[i]>=st.peek()) {
				st.pop();
			}
			if(st.size()==0) {
				ans[i]=-1;
			}else {
				ans[i]=st.peek();
			}
			st.push(arr[i]);
		}
		return ans;
	}

}
