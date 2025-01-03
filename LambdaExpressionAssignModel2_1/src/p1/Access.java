package p1;

public class Access
{
	public static ITest getRef()
	{
		//LambdaExpression
		ITest ob = (int a)->
		{
			System.out.println("*****dis1(a)*****");
			System.out.println("The value of a :"+a);
		};
		return ob;
	}//outer class method
}//outer class
