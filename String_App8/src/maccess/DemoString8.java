package maccess;
import java.util.*;
public class DemoString8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter the String-1");
			String str1=s.nextLine().trim();
			System.out.println("Enter The String-2");
			String str2 = s.nextLine().trim();
			
			int p=str1.compareTo(str2);
			if(p==0)
			{
				System.out.println("Strings are equal...");
			}
			else if(p>0)
			{
				System.out.println("Str1 is greater than str2");
			}
			else
			{
				System.out.println("Str2 is greater than str1");
			}
		}//end of try
	}

}
