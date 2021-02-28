package hashmap;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("India", 133);
		hm.put("USA", 100);
		hm.put("China", 200);
		System.out.println(hm);
		System.out.println(hm.get("India"));
		hm.put("Nigeria",20);
		hm.put("USA",200);
		System.out.println(hm);
		System.out.println(hm.containsKey("USA"));
		System.out.println(hm.containsKey("NULL"));
		
	}

}
