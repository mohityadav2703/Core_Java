package p1;

public class Access
{
	public static ITest getRef()
	{
		//Anonymous InnerClass as Implementation class
		ITest ob = new ITest()
		{
			public void dis1(int a)
			{
				System.out.println("*****dis1(a)*****");
				System.out.println("The value of a :"+a);
			}
		};
		return ob;
	}//outer class method
}//outer class
