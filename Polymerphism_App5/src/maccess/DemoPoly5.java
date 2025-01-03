package maccess;
import test.TransLog;
import java.util.*;
public class DemoPoly5 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter The hAccNo:");
			long hAccNo=s.nextLong();
			System.out.println("Enter The bAccNo:");
			long bAccNo=s.nextLong();
			System.out.println("Enter The Amt:");
			double amt=s.nextDouble();
			Date d=new Date(); //con_call
			TransLog ob = new TransLog(hAccNo,bAccNo,amt,d);
			System.out.println("======Transaction Details======");
			System.out.println("HAccNo :"+ob.gethAccNo());
			System.out.println("BAccNo :"+ob.getbAccNo());
			System.out.println("Amt:"+ob.getAmt());
			System.out.println("DateTime:"+ob.getDateTime());
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Invalid input...");
		}
	}

}
