package p1;

public class SubClass1 //outer class
{
	public int a=10;
	public static int b = 20;
	public void m1()
	{
		System.out.println("*****OuterClass m1()*****");
		System.out.println("The value of a :"+a);
		System.out.println("The value of b :"+b);
	}//outer class method

	public class SubClass2  //Instance member inner class
	{
		public int x=100;
		public static int y=200;
		public void m2() //instance method of instance inner class
		{
			System.out.println("*****InnerClass m2()*****");
			System.out.println("The value of x :"+x);
			System.out.println("The value of y :"+y);
			System.out.println("The value of a :"+a);
			System.out.println("The value of b :"+b);
		}
		public static void m22()  //static member of instance member inner class
		{
			System.out.println("*****InnerClass Static m22()*****");
		//	System.out.println("The value of a :"+a);
			System.out.println("The value of b :"+b);
		//	System.out.println("The value of x :"+x);
			System.out.println("The value of y :"+y);
		}
	}//instance member innerclass
}//outerclass
