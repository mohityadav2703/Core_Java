//write a program to count occurance of characters in String

package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharOccurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String ");
		String str = sc.nextLine();
		
		Map<Character,Integer> hs = new HashMap<Character, Integer>();
		char []ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(!hs.containsKey(ch[i])) {
				hs.put(ch[i], 1);
			}
			else {
				int cnt =hs.get(ch[i]);
				hs.put(ch[i], cnt+1);
			}
		}
		System.out.println(hs);
	}
}