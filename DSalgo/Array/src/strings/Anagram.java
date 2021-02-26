package strings;

import java.util.Arrays;

public class Anagram {

	public static boolean anagram(String A,String B) {
		boolean found = false;
		char string1[] =A.toCharArray();
		Arrays.sort(string1);
		char string2[]= B.toCharArray();
		Arrays.sort(string2);
		String a= new String(string1);
		String b=new String(string2);
		if(a.equals(b)) {
			found=true;
		}
		return found;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A="LISTEN";
		String B="SILENT";
		System.out.println(anagram(A, B));
	}

}
