package string;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String ");
		String str = sc.nextLine();
		
		Map<Character, Integer> map = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}
			else {
				int cnt=map.get(ch);
				map.put(ch, cnt+1);
			}
		}
		map.entrySet().spliterator().forEachRemaining(k-> System.out.println(k));
		sc.close();
	}
}
