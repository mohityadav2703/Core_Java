package string;
import java.util.Scanner;
public class ChangeCharWithNextLaxicographicAlphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String str = sc.nextLine();	//Ex :mohit-> npiju 
		
		for(int i=0;i<str.length();i++) {
			int k = (int)str.charAt(i)+1;
			char ch = (char)k;
			System.out.print(ch);
		}
		sc.close();
	}
}
