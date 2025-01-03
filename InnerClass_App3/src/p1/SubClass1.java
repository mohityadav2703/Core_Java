//NOTE: -> We can only create instance innerclass inside the both method (Static method & instance method) 

package p1;
public class SubClass1   //outer class
{
	public void m1(int x)	//OuterClass instance method----------------------> 1
	{
		class SubClass2	 //it will behave like instance member inner class
		{
			public void m2(int x)
			{
				System.out.println("****InnerClass instance m2(x)****");
				System.out.println("The value of x :"+x);
			}
		}// instance member innerclass close
		SubClass2 ob2 = new SubClass2();
		ob2.m2(x);
	}//outerclass Instance method close

	public static void m11(int y)   //	OuterClass static method---------------> 2
	{
		class SubClass22
		{
			public void m22(int y)
			{
				System.out.println("***InnerClass instance m22()*** ");
				System.out.println("The value of y :"+y);	
			}
		}//static member innerClass
		SubClass22 ob22 = new SubClass22();
		ob22.m22(y);
	}//outerclass static method
}//outerclass
