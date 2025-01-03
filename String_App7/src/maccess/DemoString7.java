// using equals()

package maccess;
import java.util.*;
public class DemoString7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter The String-1");
			String str1=s.nextLine().trim();
			System.out.println("Enter The String-2");
			String str2=s.nextLine().trim();
			while(true)
			{
				System.out.println("******Choice******");
				System.out.println("\t1.equals()"+"\n\t2.equlasIgnoreCase()"+"\n\t3.exit");
				System.out.println("Enter The Choice :");
				int choice=Integer.parseInt(s.nextLine());
				switch(choice)
				{
				case 1:
					boolean k = str1.equals(str2); //condition match
					System.out.println("*****equals()*****");
					if(k) //condition check
					{
						System.out.println("String ars equal..");
					}
					else
					{
						System.out.println("String are not equal...");
					}
					break;
				case 2:
					boolean z=str1.equalsIgnoreCase(str2);
					System.out.println("*****equalsIgnoreCase*****");
					if(z)
					{
						System.out.println("string are equal..");
					}
					else
					{
						System.out.println("String are not equal..");
					}
					break;
				case 3:
					System.out.println("Operations Stopped...");
					System.exit(0); //stop the program
					
					default:
						System.out.println("Invalid choice....");
				}//end of switch
			}//end of loop
		
		}//end of try
		catch(NumberFormatException nfe)
		{
			System.out.println("Invalid Input..");
		}
		
	}

}
