//Write A program to Replace the characters in string with their occurance

package test;
import java.util.Arrays;
import java.util.Scanner;
public class ReplaceCharacterWithItsOccurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String str= sc.nextLine();
		
		System.out.println("Enter the Character ");
		char ch=sc.next().charAt(0);
		
		char chars[] = str.toCharArray();
		int cnt=1;
		for(int i=0;i<chars.length;i++) {
			if(chars[i]==ch) {
				chars[i]=String.valueOf(cnt).charAt(0);
				cnt++;
			}
		}
		System.out.println(chars);
	}
}
