package p2;
import p1.*;
import java.util.*;

public class LambdaExpression2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Value-1 :");
		int v1=s.nextInt();
		System.out.println("Enter The Value-2 :");
		int v2=s.nextInt();
		System.out.println("******Choice*******");
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.ModDiv");
		System.out.println("Enter The Choice");
		int choice= s.nextInt();
		
		switch(choice)
		{
		case 1:
			// Addition class as LambdaExpression
			IArithmetic ad=(int x,int y)->x+y;
			System.out.println("Sum :"+ad.calculate(v1, v2));
			break;
		case 2:
			//SmallerValue Class as LambdaExpression
			IArithmetic sv = (int x,int y)->x-y;
			System.out.println("Subtract :"+sv.calculate(v1, v2));
			break;
		case 3:
			//Multiplication class as LambdaExpression
			IArithmetic mul = (int x,int y)->x*y;
			System.out.println("Multiply :"+mul.calculate(v1, v2));
			break;
		case 4:
			//Division Class As LambdaExpression
			IArithmetic div =(int x,int y)->x/y;
			System.out.println("Division :"+div.calculate(v1, v2));
			break;
		case 5:
			//ModDiv Class As LambdaExpression
			IArithmetic mod=(int x,int y)->x%y;
			System.out.println("ModDiv :"+mod.calculate(v1, v2));
			break;
			default :
				System.out.println("Invalid Choice.....");
				break;
		}// end of switch
		s.close();
	}

}
