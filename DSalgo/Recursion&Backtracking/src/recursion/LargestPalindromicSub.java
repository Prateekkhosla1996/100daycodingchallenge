package recursion;

public class LargestPalindromicSub {
	public static String largest(String[] str) {
		String ans = str[0];
		int max = str[0].length();
		for(int i=0;i<str.length;i++) {
			if(str[i].length()>max) {
				max = str[i].length();
				ans=str[i];
			}
			
		}
		return ans;
	}
	
	public static boolean ispalindrome(String str) {
		int i = 0;
		int j = str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static void palindromPart(String str,String asf, int count) {
		if(str.length()==0) {
				System.out.println(asf+" "+count);
			return;
		}
		for(int i=0;i<str.length();i++) {
			String prefix = str.substring(0,i+1);
			String roq = str.substring(i+1);
			if(ispalindrome(prefix)) {
				palindromPart(roq, asf+"("+prefix+")",count++);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] str= {"aba","a","ab","abbba","abbbbbbbbbbbbbaaaa"};
		String str1 = "ababbababbba";
		System.out.println(largest(str));
		palindromPart(str1, "",0);
	}

}
