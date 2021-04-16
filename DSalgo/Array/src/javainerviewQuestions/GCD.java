package javainerviewQuestions;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b= 7;
		System.out.println(gcd(a,b));
		System.out.println(elucid(a, b));
		System.out.println(gcdOptimize(a, b));
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
	public static int elucid(int a,int b) {
		while(a!=b) {
			if(a>b) {
				a=a-b;
			}else {
				b=b-a;
			}
		}
		return a;
	}
	public static int gcdOptimize(int a,int b) {
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}
}
