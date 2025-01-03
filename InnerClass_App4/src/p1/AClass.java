package p1;

public abstract class AClass
{
	public class SubClass2
	{
		public void m2(int b)
		{
			System.out.println("****m2(b)****");
			System.out.println("The value of b :"+b);
		}
	}//instance member inner class
	public static class SubClass22
	{
		public void m22(int c)
		{
			System.out.println("*****m22(c)*****");
			System.out.println("The value of c :"+c);
		}
	}//static member inner class
}//outer abstract class
