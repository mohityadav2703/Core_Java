package maccess;
import java.util.*;
				   //step-1(extends Parent class)
									//Exception is the parent class of all exception
public class DemoException2 extends Exception{

	// step-2 must use parameterized constructor passing string message
	public DemoException2(String msg)
	{
	//step-3 using super() to pass message to parent class
		super(msg);
	}
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
	//step-4 declare all statements in try block
		try
		{
			System.out.println("Enter the bSal :");
	//step-5 create one condition to raise the exception		
			int bSal = s.nextInt();//Exception for Non_int_value
			if(bSal<12000)
			{
	// step-6 when excep cond true, create object for user defined class			
				DemoException2 ob= new DemoException2("Invalid bSal....");
	//step-7 use throw keyword to throw obj reference to catch block
				throw ob;
			}
			float totSal=bSal+(0.93F*bSal)+(0.63F*bSal);
			System.out.println("****Details****");
			System.out.println("BSal:"+bSal);
			System.out.println("TotSal:"+totSal);
		}//end of try
		catch(InputMismatchException ime)
		{
	// step-8 display the msg from catch block		
			System.out.println("Enter only integer value....");
		}
		catch(DemoException2 ob)
		{
			String msg = ob.getMessage();
			System.out.println(msg);
		}
		finally
		{
			s.close();
		}
	}

}
