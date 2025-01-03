// print occurance of characters

package test;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharOccuranceInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String str=sc.nextLine();		//mohit
		
		Map<Character, Integer> hm = new LinkedHashMap<Character,Integer>();
		char []chars=str.toCharArray();
		for(Character ch : chars) {
			if(!hm.containsKey(ch)) {
				hm.put(ch, 1);
			}
			else {
				int cnt=hm.get(ch);
				hm.put(ch, cnt+1);
			}
		}
		System.out.println(hm);
	}

}
