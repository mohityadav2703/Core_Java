//concrete method accepted by interface
package p1;

public interface ITest1 extends ITest{
	public abstract void m7(int r);
	public abstract void m1(int a); //duplicate abstract method
	public static void m2(int x,int y) //duplicate static concrete method
	{
		System.out.println("=====duplicate static method=====");
		System.out.println("The value of x :"+x);
		System.out.println("The value of y :"+y);
	}
}
