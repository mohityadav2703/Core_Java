package p2;
import java.util.Scanner;
import p1.GreaterValue;
import p1.SmallerValue;

public class DemoMethod8 
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number :");
		int val1=s.nextInt();
		System.out.println("Enter Second Number :");
		int val2=s.nextInt();
		System.out.println("*****Choice*****");
		System.out.println("1.GreaterValue\n2.SmallerValue");
		System.out.println("Choose Any Option");
		int choice=s.nextInt();
		
		switch(choice)
		{
		case 1:
			GreaterValue gv = new GreaterValue();
			int res1=gv.greaterValue(val1,val2);
			System.out.println("GreaterValue :"+res1);
			break;
		case 2:
			SmallerValue sm = new SmallerValue();
			int res2=sm.smallerValue(val1,val2);
			System.out.println("SmallerValue :"+res2);
			break;
			
			default:
				System.out.println("Invalid Choice......");
		}
		s.close();
		

	}
	

}
