//using generalization in abstract class
package p1;

public abstract class AClass {
	public abstract void dis1(int a);
	public void dis2(int b)
	{
		System.out.println("====INSTANCE METHOD====");
		System.out.println("The value of b :"+b);
	}
	static
	{
		System.out.println("=====STATIC BLOCK=====");
	}
	

}
