package javainerviewQuestions;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b= 7;
		System.out.println(gcd(a,b));
	}
	
	public static int gcd(int a,int b) {
		int res = Math.min(a, b);
		while(res>0) {
			if(a%res==0 && b%res==0) {
				break;
			}
			res--;
		}
		return res;
	}
}
