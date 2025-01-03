package maccess;
import java.util.*;
public class DemoString17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;)
		{
			System.out.println("Enter The String: ");
			String str1 =sc.nextLine();
			
			StringBuffer sb = new StringBuffer(str1);
			sb.reverse();
			String str2 = new String(sb);
			if(str1.equals(str2))
			{
				System.out.println("palindrome String....");
			}
			else
			{
				System.out.println("Not palindrome String....");
			}
		}
		

	}

}
