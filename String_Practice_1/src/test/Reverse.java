package test;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The String");
		String str=s.nextLine();
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println("Reverse :"+sb.reverse());
	}
}
