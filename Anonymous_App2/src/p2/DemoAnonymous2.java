package p2;
import p1.*;

public class DemoAnonymous2 {

	public static void main(String[] args)
	{
		ITest ob = new ITest() //child class as anonymous inner class
		{
			public void m1(int a)
			{
				System.out.println("*****m1(a)*****");
				System.out.println("The value of a :"+a);
			}
			@SuppressWarnings("unused")
			public void m3(int c)
			{
				System.out.println("******m3(c)*****");
				System.out.println("The value of c :"+c);
			}
		};
		ob.m1(10);
		ob.m2(11);
	//	ob.m3(12) Error
		ITest.m4(20);
	}

}
