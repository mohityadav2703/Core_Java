//palimdrom

package test;
import java.util.Scanner;
public class Palimdrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The String");
		String str1=s.nextLine();
		try(s){
			StringBuffer sb=new StringBuffer(str1);
			sb.reverse();
			String str2=new String(sb);
			if(str1.equals(str2))
			{
				System.out.println("String is Palimdrome..");
			}
			else
			{
				System.out.println("String is not Palimdrome..");
			}
			
		}
		
	}

}
