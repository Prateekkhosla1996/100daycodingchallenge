package javainerviewQuestions;

public class SquareSumNnaturalNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(sum(n));
	}
	public static int sum (int n) {
		int sum = 0;
		for(int i = 0;i <= n;i++) {
			sum+=i*i;
		}
		return sum;
	}
}
