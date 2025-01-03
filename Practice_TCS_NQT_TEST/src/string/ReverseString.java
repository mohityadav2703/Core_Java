package string;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String ");
		String str = sc.nextLine();
		String revString="";
		
		for(int i=str.length()-1;i>=0;i--) {
			char ch =str.charAt(i);
			revString=revString+ch;
		}
		System.out.println(revString);
	}
}
