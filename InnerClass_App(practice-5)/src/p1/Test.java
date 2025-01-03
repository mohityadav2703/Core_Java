package p1;

public class Test {
	 int a = 10;
	 static int b = 11;

		//INSTANCE INNER CLASS
		public class Subclass1
		{
			int c=12;
			static int d=13;
			
			public void m1()
			{
				System.out.println("The Value of a :"+a);
				System.out.println("The Value of b :"+b);
				System.out.println("The value of c :"+c);
				System.out.println("The value of d :"+d);
			}
			
			public static void m2()
			{
		//		System.out.println("The Value of a :"+a);
				System.out.println("The Value of b :"+b);
		//		System.out.println("The value of c :"+c);
				System.out.println("The value of d :"+d);
			}
		}
		
		//STATIC INNER CLASS
		static class SubClass2
		{
			int e=14;
			static int f=15;
			
			public void m3()
			{
				//static member instance method cannot access instance member of inner class
			//	System.out.println("The Value of a :"+a);
				System.out.println("The Value of b :"+b);
			//	System.out.println("The value of c :"+c);
			//	System.out.println("The value of d :"+d);
				System.out.println("The value of c :"+e);
				System.out.println("The value of d :"+f);
			}
			
			public static void m4()
			{
			//	System.out.println("The Value of a :"+a);
				System.out.println("The Value of b :"+b);
			//	System.out.println("The value of c :"+c);
			//	System.out.println("The value of d :"+d);
			//	System.out.println("The value of c :"+e);
				System.out.println("The value of d :"+f);
			}
		}
}
























