package test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubStringLengthHaveNotRepeatedChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String str = sc.nextLine();

		Map<Character,Integer> map = new LinkedHashMap<>();
		char ch[]= str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(!map.containsKey(ch[i])) {
				map.put(ch[i], i);
			}
			else {
				i=map.get(ch[i]);
				map.clear();
			}
		}
		String longestSubString=map.keySet().toString();
		System.out.println(longestSubString);
	}
}
