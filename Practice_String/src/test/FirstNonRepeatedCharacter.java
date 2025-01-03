//write a program to find first non repeated character

package test;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");				
		String str=sc.nextLine(); // elephant
	
		for(int i=0;i<str.length();i++) {
			boolean unique=true;
			for(int j=0;j<str.length();j++) {
				if(i!=j && str.charAt(i)==str.charAt(j)) {
					unique=false;
				}
			}
			if(unique) {
				System.out.println(str.charAt(i));
				break;
			}
		}
		
		//second way (using collection)
//		Map<Character,Integer> map=new LinkedHashMap<Character, Integer>();
//		char[] chars=str.toCharArray();
//		for(int i=0;i<str.length();i++) {
//			char ch=str.charAt(i);
//			if(!map.containsKey(ch)) {
//				map.put(ch,1);
//			}
//			else {
//				int cnt=map.get(ch);
//				map.put(ch, cnt+1);
//			}
//		}
//		System.out.println(map);
//		for(Entry<Character,Integer> entrySet : map.entrySet()) {
//			if(entrySet.getValue()==1) {
//				System.out.println(entrySet.getKey());
//				break;
//			}
//		}
		sc.close();	
	}
}
