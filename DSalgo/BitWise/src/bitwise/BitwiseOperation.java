package bitwise;

public class BitwiseOperation {

	
	public static void main(String[] args) {
		int x = 6;
		int y = 3;
		// and operator		
		System.out.println(x&y);
		// or operator		
		System.out.println(x|y);
//		xor operator
		System.out.println(x^y);
//		not operator represents negative no in java we can do that by :2^32-x
		System.out.println(~x+" "+~y);
//		left shift operator
		System.out.println(x<<2);
//		right shift operator
		System.out.println(x>>1);
		System.out.println(x>>2);
		System.out.println(x>>4);
		System.out.println(x>>4);
//		unsigned shift
		System.out.println(-2>>>1);
		kthBit(5, 2);
	}
	public static void kthBit(int n,int k) {
		
		if((n & (1 << (k - 1)))!=0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}
