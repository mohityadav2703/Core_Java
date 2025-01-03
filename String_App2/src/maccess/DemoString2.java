// count of vowels

package maccess;
import java.util.*;
public class DemoString2 
{
	public static void main(String[] args) 
	{
		int count=0;
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter The String:");
			String str=s.nextLine().toLowerCase();
			
			for(int i=0;i<str.length();i++)
			{
				char ch = str.charAt(i);
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					count++;
				}
			}
			System.out.println("Total Vowels in String Are :"+count);
		}

	}

}
