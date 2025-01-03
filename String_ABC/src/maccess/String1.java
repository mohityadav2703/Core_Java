package maccess;
import java.util.*;
public class String1 {
	public static void main(java.lang.String[] args) {
	String ab="abc";
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.println("Enter The String");
			String str=s.nextLine().toLowerCase();
				char ch=str.charAt(0);
				if(ch=='a' || ch=='e'||ch=='i' ||ch=='o'||ch=='u')
				{
					System.out.println(str.concat(ab));
				}
				else
				{
					System.out.println("Given String First Char is CONSONENT : "+ab);
				}
		}catch(InputMismatchException ime)
		{
			ime.printStackTrace();
		}

	}

}
