package maccess;
import java.util.*;
public class DemoException2 extends Exception{
	public DemoException2(String msg)
	{
		super(msg);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try
		{
			System.out.println("Enter Marks:");
			int mark=sc.nextInt();
			if(mark<0 || mark>100)
			{
				DemoException2 ob = new DemoException2("Invalid marks..");
				throw ob;
			}
			if(mark>=0 && mark<=34)
			{
				DemoException2 ob = new DemoException2("Failed...");
				throw ob;
			}
			System.out.println("Valid marks...");
			System.out.println("marks is :"+mark);
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Enter Only Integer Value..");
		}
		catch(DemoException2 ob)
		{
			String ms=ob.getMessage();
			System.out.println(ms);
		}
		finally
		{
			sc.close();
		}

	}

}
