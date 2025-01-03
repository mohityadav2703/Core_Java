package string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String str="Committee";
		char ch[] = str.toCharArray();
		Set<Character> hs = new LinkedHashSet<Character>();
		for(int i=0;i<ch.length;i++) {
			hs.add(ch[i]);
		}
		
		System.out.print(hs);
	}
}
