package string;

import java.util.HashMap;
import java.util.Map;

public class MaxOccuringCharacter {
	public static void main(String[] args) {
		String str = "ccbbbbbbbbfhh";
		int num1 = 1, num2 = 0;

		char[] ch = str.toCharArray(); // h e l l o
		Map<Character,Integer> map = new HashMap<>();
		for (int i = 0; i < ch.length; i++) { // h e l l o
			if(!map.containsKey(ch[i])) {
				map.put(ch[i], 1);
			}
			else {
				int cnt=map.get(ch[i]);
				map.put(ch[i], cnt+1);
			}
		}
		System.out.println(map);
	}
}
