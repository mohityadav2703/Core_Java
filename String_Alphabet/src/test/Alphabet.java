package test;
import java.util.*;
public class Alphabet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String :");
		String str=sc.nextLine().toLowerCase();
		
		int count =0;
		int number=0;
		int cons = 0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u')
			{
				System.out.print(ch+" ");
				count++;
			}
			int k=(int)ch;
			if(k>=48 && k<=57) {
				number++;
			}
			int alpha=count+number;
			cons=alpha-count;
		}
		System.out.println("\nTotal Vowels :"+count);
		System.out.println("\nTotal Numbers :"+number);
		System.out.println("\nTotal Consonant :"+cons);
	}

}
