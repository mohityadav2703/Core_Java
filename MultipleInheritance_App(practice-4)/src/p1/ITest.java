//concrete method accepted by interface

package p1;

public interface ITest {
	int p=10; // automatically public static final
	static int b=15; //by default static and final and by default access modifier is public
	void m1(int a);//by default public and non-static abstract method
	public static void m2(int x,int y) // static concrete method
	{
		System.out.println("=====Static concrete method=====");
		System.out.println("The value of x :"+x);
		System.out.println("The value of y :"+y);
	}
	default void m3(float k,double l) 
	{
	
		System.out.println("=====default concrete method=====");
		System.out.println("The value of k :"+k);
		System.out.println("The value of l :"+l);
	}
	private void m4(int c ,long d) //non static private method
	{
		System.out.println("=====private concrete method=====");
		System.out.println("The value of  :"+c);
		System.out.println("The Value of  :"+d);
	}
	private static void m6(int s,int t) //static private method
	{
		System.out.println("=====static private method=====");
		System.out.println("The value of s :"+s);
		System.out.println("The value of t :"+t);
	}
	public default void m5(int u,int v,int w,int z)
	{
		this.m4(u, v);
		ITest.m6(w,z);
	}
	
	
}
