package p2;
import p1.*;
import java.util.*;
public class DemoMultipleInheritance2 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Value:");
		int v1=s.nextInt();
		System.out.println("Enter Second Value:");
		int v2=s.nextInt();
		System.out.println("**********Choice************");
		System.out.println("1.GreaterValue\n2.SmallerValue");
		System.out.print("Enter The Choice:");
		int choice=s.nextInt();
		
		switch(choice)
		{
		case 1:
			GreaterValue gv=new GreaterValue();
			int r1 = gv.compareTo(v1,v2);
			System.out.println("GreaterValue :"+r1);
			break;
			
		case 2:
			SmallerValue sv=new SmallerValue();
			int r2=sv.compareTo(v1,v2);
			System.out.println("SmallerValue :"+sv);
			break;
			
			default:
				System.out.println("Invalid choice...");
		}
		s.close();
	}
}
