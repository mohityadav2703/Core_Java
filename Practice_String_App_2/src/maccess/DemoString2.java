package maccess;
import java.util.*;
public class DemoString2 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter The First String :");
			String str1=s.nextLine().trim();
			System.out.println("Enter The Second String :");
			String str2=s.nextLine().trim();
			
			while(true)
			{
				System.out.println("=====Choice=====");
				System.out.println("\t1.equals()"+"\n\t2.equalsIgnoreCase()"+"\n\t3.compareTo()"+"\n\t4.compareToIgnoreCase()"+"\n\t5.Exit");
				System.out.println("Enter The Choice :");
				int choice=Integer.parseInt(s.nextLine());
				switch(choice)
				{
				case 1:
					boolean k=str1.equals(str2);
					if(k)
					{
						System.out.println("Strings Are Equals...");
					}
					else
					{
						System.out.println("Strings Are Not Equals...");
					}
					break;
				case 2:
					boolean k1=str1.equalsIgnoreCase(str2);
					if(k1)
					{
						System.out.println("Strings Are Equals....");
					}
					else
					{
						System.out.println("Strings Are Not Equals.....");
					}
					break;
				case 3:
					int k2=str1.compareTo(str2);
					if(k2==0)
					{
						System.out.println("Strings Are Equals....");
					}
					else if(k2>0)
					{
						System.out.println("Str1 is Greater....");
					}
					else
					{
						System.out.println("Str2 is Greater....");
					}
					break;
				case 4:
					int k3=str1.compareToIgnoreCase(str2);
					if(k3==0)
					{
						System.out.println("Strings Are Equals.....");
					}
					else if(k3>0)
					{
						System.out.println("Str1 is Greater...");
					}
					else
					{
						System.out.println("Str2 is Greater...");
					}
					break;
				case 5:
					System.out.println("Operation Stopped....");
					System.exit(0);
				}
						
			}
		}
		
	}
}
