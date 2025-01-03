package maccess;
import java.util.*;

public class DemoException1 extends Exception{
	public DemoException1(String msg)
	{
		super(msg);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter The Basic Salary :");
			int bsal = sc.nextInt();
			if(bsal < 12000)
			{
				DemoException1 ob = new DemoException1("Invalid Balance...");
				throw ob;
			}
			float totSal=bsal+(0.93F*bsal)+(0.63F*bsal);
			System.out.println("*********DETAILS**********");
			System.out.println("BSal :"+bsal);
			System.out.println("TotSal :"+totSal);
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Enter Only Integer Value...");
		}
		catch(DemoException1 ob)
		{
			String msg=ob.getMessage();
			System.out.println(msg);
		}
		finally
		{
			sc.close();
		}
		

	}

}
