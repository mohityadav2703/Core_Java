package string;
import java.util.Scanner;

public class SumOfNumberInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String ");
		String str = sc.nextLine();
		int sum=0;
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int k = (int) ch;
			if(k>=48 && k<=57) {
				sum=sum+k;
			}
		}
		System.out.println(sum);
	}
}
