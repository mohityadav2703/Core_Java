package string;
import java.util.Arrays;
import java.util.Scanner;

public class CheckStringIsAnagramOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First String");
		String str1=sc.nextLine().replaceAll("\\s", "");//mohit
		System.out.println("Enter The Second String");
		String str2=sc.nextLine().replaceAll("\\s", "");	//ohmit
	
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		
		Arrays.sort(ch1);	//himot
		Arrays.sort(ch2);	//himot
		
		String s1 = new String(ch1);
		String s2 = new String(ch2);
		
		if(s1.equals(s2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		
		
		sc.close();
	}
}
