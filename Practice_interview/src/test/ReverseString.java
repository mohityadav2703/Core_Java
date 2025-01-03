//reverse string

package test;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String str= sc.nextLine();
		//1st way
		String rev1="";
		for(int i=str.length()-1;i>=0;i--) {
			rev1=rev1+str.charAt(i);
		}
		System.out.println(rev1);
		
		//2nd way
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
		
		//3rd way
		StringBuilder sb1 = new StringBuilder(str);
		sb1.reverse();
		System.out.println(sb1);
	}
}
