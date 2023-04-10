package char_concurrency;

import java.util.HashMap;
import java.util.Map.Entry;

public class ConcurrencyCheck {
	
	static void concurrency_Check(String input) {
		
		String res="";
		
		HashMap<Character, Integer> hm =  new HashMap<Character,Integer>();
		
		char[] ch = input.toCharArray();
		for(char c : ch) {
			if(hm.containsKey(c)) {
				hm.put(c,hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
		}
		
		
		for(Entry<Character, Integer> set : hm.entrySet()) {
			//System.out.println(set.getKey()+set.getValue());
			res += set.getKey();
			res += set.getValue(); 
		}
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		
		String input = "aabcabbdc";
		
		concurrency_Check(input);
		
	}

}
