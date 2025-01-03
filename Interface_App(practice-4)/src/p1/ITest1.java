//using generalization in Interface
package p1;

public interface ITest1 {

	public void dis1(int a);
	public default void dis2(int b,int c)
	{
		System.out.println("=====dis2(b,c)=====");
		System.out.println("The value of b:"+b);
		System.out.println("The value of c:"+c);
	}
	public static void dis3(int x)
	{
		System.out.println("=====dis3(x)======");
		System.out.println("The value of x :"+x);
	}
}
