//Static member inner class

package p1;

public class SubClass1 {   // instance member outer class
	public int a=10;
	public static int b=20;
	public void m1()
	{
		System.out.println("========OUTER-CLASS INSTANCE METHOD M1()=========");
		System.out.println("The Value of a :"+a);
		System.out.println("The Value of b :"+b);
	}
	public static class SubClass2    //Static member InnerClass
	{
		public int x=100;
		public static int y=200;
		public void m2()
		{
			System.out.println("========INNER-CLASS INSTANCE METHOD M2()========");
			System.out.println("The value of x :"+x);
			System.out.println("The Value of y :"+y);
		//	System.out.println("The value of a :"+a); //static member inner class can't access the outer class instance member
			System.out.println("The Value of b :"+b);
		}
		public static void m3()
		{
			System.out.println("========INNER-CLASS STATIC METHOD M3()=========");
			System.out.println("The Value Of b :"+b);
			System.out.println("The value Of y :"+y);
		}
		
	} //End of innerClass
} // end of outer class
