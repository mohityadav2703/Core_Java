package p2;
import java.util.Scanner;

import p1.*;
public class DemoAnonymous4 {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Val-1");
		int v1=s.nextInt();
		System.out.println("Enter Second Val-2");
		int v2=s.nextInt();
		System.out.println("******Choice******");
		System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.ModDiv");
		System.out.println("Enter Your Choice");
		int choice=s.nextInt();
		
		switch(choice)
		{
		case 1:
			// Addition as Anonymous
			IArithmetic ad= new IArithmetic()
			{
				public double calculate(int x,int y)
				{
					return x+y;
				}
			};
			System.out.println("Sum :"+ad.calculate(v1,v2));
			break;
			
		case 2:
			//subtraction as anonymous
			IArithmetic sub = new IArithmetic()
			{
				public double calculate(int x,int y)
				{
					return x-y;
				}
			};
			System.out.println("Subtract :"+sub.calculate(v1, v2));
			break;
			
		case 3:
			//multiplication as Anonymous
			IArithmetic mul = new IArithmetic()
			{
				public double calculate(int x,int y)
				{
					return x*y;
				}
			};
			System.out.println("Multiply :"+mul.calculate(v1, v2));
			break;
			
		case 4:
			//division as Anonymous
			IArithmetic div = new IArithmetic()
			{
				public double calculate(int x,int y)
				{
					return x/y;
				}
			};
			System.out.println("Division :"+div.calculate(v1, v2));
			break;
			
		case 5:
			//ModDiv as Anonymous
			IArithmetic mod = new IArithmetic()
			{
				public double calculate(int x,int y)
				{
					return x%y;
				}
			};
			System.out.println("ModDiv :"+mod.calculate(v1, v2));
			break;
			
			default:
				System.out.println("Invalid Choice.....");
		}// end of switch
		s.close();
	}

}
