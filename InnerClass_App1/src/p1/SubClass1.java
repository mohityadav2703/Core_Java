package p1;

public class SubClass1 //outer class
{
	public int a=10;
	public static int b=20;
	public void m1()
	{
		System.out.println("*****OuterClass m1()******");
		System.out.println("The value of a :"+a);
		System.out.println("The value of b :"+b);
	}//outerclass method
	public static class SubClass2   // Static member inner class
	{
		public int x=100;
		public static int y=200;
		public void m2()  //Instance metod of static member inner class
		{
			System.out.println("******InnerClass instance m2()******");
			System.out.println("The value of x :"+x);
			System.out.println("The value of y :"+y);
		//	System.out.println("The value of a :"+a); // static class method can't access non static field
			System.out.println("The value of b :"+b);
		}
		public static void m22() //static method of static member inner class
		{
			System.out.println("****InnerClass stsatic m22()****");
		//	System.out.println("The value of a :"+a);//Cannot make a static reference to the non-static field a
			System.out.println("The value of b :"+b);
		//	System.out.println("The value of x :"+x);// Cannot make a static reference to the non-static field x
			System.out.println("The value of y :"+y);
		}
	}// end of static member inner class
	
} //  end of outer class
