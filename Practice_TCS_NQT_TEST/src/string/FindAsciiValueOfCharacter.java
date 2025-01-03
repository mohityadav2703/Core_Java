package string;
import java.util.Scanner;

public class FindAsciiValueOfCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.nextLine();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int k=(int)ch;
			System.out.println(ch +" -> "+k);
		}
	}
}
