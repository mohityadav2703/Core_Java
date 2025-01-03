package p2;
import p1.*;
import java.util.*;

public class DemoLambdaExpression2 
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter The Value-1 :");
		int v1=s.nextInt();
		System.out.println("Enter The Value-2 :");
		int v2=s.nextInt();
		System.out.println("*****Choice*****");
		System.out.println("\n1.GreaterValue\n2.SmallerValue");
		System.out.println("Enter Your Choice");
		int choice=s.nextInt();
		
		switch(choice)
		{
		case 1:
			// GreaterValue class as LambdaExpression
			IComparable gv =(int x,int y)->
			{
				if(x>y)
					return x;
				else
					return y;
			};
			int r1=gv.compareTo(v1, v2);
			System.out.println("GreaterValue :"+r1);
			break;
		
		case 2:
			//SmallerValue class as LamdaExpression
			IComparable sv =(int x,int y)->
			{
				if(x<y)
					return x;
				else
					return y;
			};
			int r2=sv.compareTo(v1, v2);
			System.out.println("SmallerValue :"+r2);
			break;
			
			default :
				System.out.println("Invalid Choice...");
				break;
		}//end of switch
		s.close();
	}

}
