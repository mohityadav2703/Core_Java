package maccess;
import java.util.*;
public class DemoException3  extends Exception
{
	public DemoException3(String msg)
	{
		super(msg);
	}
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Computer Marks:");
		int marks = s.nextInt();//exception for non-integer value
		try
		{
			if(marks<0 || marks>100) //exception condition
			{
				DemoException3 de = new DemoException3("Invalid marks...");
				throw de;
			}
			if(marks>=0 && marks<=34)
			{
				DemoException3 de = new DemoException3("Failed in subject....");
				throw de;
			}
			System.out.println("Valid  marks...");
			System.out.println("Marks in computers:"+marks);
		}
		
		catch(InputMismatchException ime)
		{
			System.out.println("Eneter Only Integer Value....");
		}
		catch(DemoException3 ob)
		{
			System.out.println(ob.getMessage());
		}
		finally
		{
			s.close();
		}
	}

}
