package string;
import java.util.Scanner;
public class RemoveSpecialCharExceptAlphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String ");
		String str = sc.nextLine().toUpperCase();
		String removeAllSpecialChar="";
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int k=(int)ch;
			if(k>=65 && k<=90 ) {
				removeAllSpecialChar=removeAllSpecialChar+ch;
			}
		}
		System.out.println(removeAllSpecialChar);
		
		sc.close();
	}
}
