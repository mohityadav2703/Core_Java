package maccess;
import java.util.*;

public class DemoException1 
{
	public static void main(String[] args)
	{

		Scanner sc= new Scanner(System.in);
		try
		{
			System.out.println("Enter Int value :");
			int n=sc.nextInt();//Exception for int_value
			System.out.println("The value of n :"+n);
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Enter Only Integer Value...");
		}
		finally
		{
			sc.close();
		}
		
	}
}
