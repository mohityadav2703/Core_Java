package p1;

public class ClassA {   //outer class
	public int a=10;
	public static int b=20;
	public void m1()
	{
		System.out.println("==========OUTER-CLASS METHOD M1()============");
		System.out.println("The Value Of a :"+a);
		System.out.println("The Value Of b :"+b);
	}
	
	public class SubClass1 //instance inner class
	{
		public int x=30;
		public static int y=40;
		public void m2() // inner class instance method
		{
			System.out.println("==========SUBCLASS1 INSTANCE METHOD M2()==========");
			System.out.println("The value of a :"+a);
			System.out.println("The Value of b :"+b);
			System.out.println("The Value of x :"+x);
			System.out.println("The Value of y :"+y);
		}
		public static void m3()  // inner class static method
		{
			System.out.println("==========SUBCLASS1 STATIC METHOD M3()===========");
		//	System.out.println("The Value of a :"+a); instance inner class,static method can't access instance components of outerclass and inner class
		//	System.out.println("The value of x :"+x); instance inner class,static method can't access instance components of outerclass and inner class
			System.out.println("The Value of b :"+b);
			System.out.println("The Value of y :"+y);	
		}
	}//end of inner class
	
	public static class SubClass2   // static inner class
	{
		public int k=50;
		public static int l=60;
		public void m4()
		{
			System.out.println("==========SUBCLASS-2 INSTANCE METHOD M4()===========");
			System.out.println("The Value Of k :"+k);
			System.out.println("The Value of l :"+l);
		//	System.out.println("The Value of a :"+a);static inner class can't access the instance component of outer class
			System.out.println("The value of b :"+b);
		}
		public static void m5()
		{
			System.out.println("==========SUBCLASS-2 STATIC METHOD M5()==========");
		//	System.out.println("The Value of k :"+k);  static inner class,static method can't access the instance component of outer and inner class
		//	System.out.println("The Value of a :"+a);  static inner class,static method can't access the instance component of outer and inner class
			System.out.println("The Value of l :"+l);
			System.out.println("The value of b :"+b);
		}
		
	} //end of static inner class
	
}// end of outer class