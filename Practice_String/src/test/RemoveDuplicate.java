//write a program to remove duplicate character from string

package test;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class RemoveDuplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The String :");
		String str=sc.nextLine();
		
//		//First Way(Using java 8)
		StringBuilder sb = new StringBuilder();
		str.chars().distinct().forEach(c-> sb.append((char)c));
//		
//		//Second Way(indexOf())
//		StringBuilder sb1=new StringBuilder();
//		for(int i=0;i<str.length();i++) {
//			char ch=str.charAt(i);
//			int index=str.indexOf(ch,i+1);
//			if(index==-1) {
//				sb1.append(ch);
//			}
//		}
//		System.out.println(sb1);
//		
//		//Third Way(charArray()) 
//		char chArr[]=str.toCharArray();
//		StringBuilder sb2=new StringBuilder();
//		for(int i=0; i<chArr.length; i++) {
//			boolean repeated=false;
//			for(int j=i+1;j<chArr.length;j++) {
//				if(chArr[i]==chArr[j]) {
//					repeated=true;
//					break;
//				}
//			}
//			if(!repeated) {
//				sb2.append(chArr[i]);
//			}
//		}
//		System.out.println(sb2);
		
		//fourth way
//		Set<Character> set = new LinkedHashSet<Character>();
//		for(int i=0;i<str.length();i++) {
//			set.add(str.charAt(i));
//		}
//		System.out.println(set);
	}
}
