package maccess;
import java.util.*;

import test.TransLog;

public class DemoRecord {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try
			{
				System.out.println("Enter The HAccNo :");
				long hAccNo=s.nextLong();
				System.out.println("Enter The BAccNo :");
				long bAccNo=s.nextLong();
				System.out.println("Enter The Amt");
				double amt=s.nextDouble();
				Date d=new Date(); //con_Call
				
				TransLog ob=new TransLog(hAccNo,bAccNo,amt,d);
				System.out.println("======Transaction Details======");
				System.out.println("HAccNo :"+ob.hAccNo());
				System.out.println("BAccNo :"+ob.bAccNo());
				System.out.println("Amt :"+ob.amt());
				System.out.println("DateTime :"+ob.dateTime());
			}
			catch(InputMismatchException ime)
			{
				System.out.println("Invalid Input...");
			}
			catch(IllegalArgumentException iae)
			{
				System.out.println(iae.getMessage());
			}
		
		}//End Of Try With Resource
	}

}
