package p2;
import p1.*;

public class DemoLambdaExpression1 
{
	public static int b=20;
	public static void main(String[] args)
	{
		int c=30;
		// LambdaExpression
		ITest ob =(int a)->
		{
			System.out.println("*****dis1(a)*****");
			System.out.println("The value of a :"+a);
			System.out.println("The value of b :"+b);
			System.out.println("The value of c :"+c);
			System.out.println("The value of k :"+ITest.k);
		};
		ob.dis1(12);
		ob.dis2(13);
		

	}

}
