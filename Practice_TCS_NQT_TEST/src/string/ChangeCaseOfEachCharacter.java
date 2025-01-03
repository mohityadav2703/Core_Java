package string;
import java.util.Scanner;

public class ChangeCaseOfEachCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String str =sc.nextLine();   //ex :MoHit ==> mOhIT
		char ch[]=str.toCharArray();
		char ch1[]=new char[ch.length];
		for(int i=0;i<ch.length;i++) {
		
			if(Character.isUpperCase(ch[i])) {
				ch1[i]=Character.toLowerCase(ch[i]);
			}
			else {
				ch1[i]=Character.toUpperCase(ch[i]);
			}
		}
		System.out.print(ch1);
	sc.close();
	}
}
