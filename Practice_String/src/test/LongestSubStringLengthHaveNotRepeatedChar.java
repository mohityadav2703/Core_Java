package test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubStringLengthHaveNotRepeatedChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String str = sc.nextLine();

		String longestSubString = null;
		int longestSubStringLength = 0;
		Map<Character, Integer> map = new LinkedHashMap<>();
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (!map.containsKey(ch)) {
				map.put(ch, i);
			} else {
				i = map.get(ch);
				map.clear();
			}
			if (map.size() > longestSubStringLength) {
				longestSubStringLength = map.size();
				longestSubString = map.keySet().toString();
			}
		}
		System.out.println("The Longest SubString :" + longestSubString);
		System.out.println("The Longest SubString Length :" + longestSubStringLength);
		sc.close();
	}
}
