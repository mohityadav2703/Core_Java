//local member inner class
package p1;

public class ClassA {  //outer class
	public void m1()  //instance method
	{
		@SuppressWarnings("unused")
		class SubClass1  //instance member local inner class
		{
			public int a=10;
			public static int b=12;
			public void m11()
			{
				System.out.println("The value of a :"+a);
				System.out.println("The Value of b :"+b);
			}
		} // end of instance class
	} // end of instance method
	public static void m2()
	{
		@SuppressWarnings("unused")
		class SubClass2 //static member local inner class
		{
			
			public static int y=32;
			public static void m22()
			{
				System.out.println("The value of y :"+y);
			}
		}
	}
}
	

