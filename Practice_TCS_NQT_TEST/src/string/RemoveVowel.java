package string;
import java.util.Scanner;

public class RemoveVowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String str = sc.nextLine().toLowerCase();
		String afterRemoveVowel="";
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
				afterRemoveVowel=afterRemoveVowel+ch;
				
			}
		}
		System.out.println(afterRemoveVowel);
	}
}
