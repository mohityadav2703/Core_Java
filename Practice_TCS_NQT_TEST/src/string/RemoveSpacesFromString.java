package string;
import java.util.Scanner;
public class RemoveSpacesFromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String str = sc.nextLine();
		String afterRemoveSpace="";
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int k=(int)ch;
			if(k!=32) {
				afterRemoveSpace=afterRemoveSpace+ch;
			}
		}
		System.out.println(afterRemoveSpace);
	}
}
