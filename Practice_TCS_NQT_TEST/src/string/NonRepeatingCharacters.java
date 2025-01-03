package string;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacters{
	public static void main(String[] args) {
		
		String str="committee";
		char ch[] = str.toCharArray();
		Map<Character, Integer> hm = new HashMap<Character,Integer>();
		for(char c :ch) {
			if(hm.get(c)==null) {
				hm.put(c, 1);
			}
			else {
				hm.put(c, hm.get(c)+1);
			}
		}
		hm.entrySet().stream().filter(map -> map.getValue()==1).forEach(System.out ::println);
	}
}
    
