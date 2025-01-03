package p1;

public interface ITest
{
	public static class SubClass1
	{
		public void m1(int a)
		{
			System.out.println("****m1(a)****");
			System.out.println("The value of a :"+a);
		}
	}//static member InnerClass
}//outerInterface
