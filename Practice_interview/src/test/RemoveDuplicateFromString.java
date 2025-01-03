package test;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateFromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String str = sc.nextLine();
		
		//1st way
		StringBuilder sb = new StringBuilder();
		str.chars().distinct().forEach(c-> sb.append((char)c));
		System.out.println(sb);
		
		//2nd way
		StringBuilder sb1 = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int index=str.indexOf(ch, i+1);
			if(index== -1) {
				sb1.append(ch);
			}
		}
		System.out.println(sb1);
		
		//3rd way
		StringBuilder sb2 = new StringBuilder();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			boolean repeated=false;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					repeated=true;
					break;
				}
			}
			if(!repeated) {
				sb2.append(ch[i]);
			}
		}
		System.out.println(sb2);
		
		//4th way
		Set<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		for(char c : set) {
			System.out.print(c);
		}		
		
		
	}
}
