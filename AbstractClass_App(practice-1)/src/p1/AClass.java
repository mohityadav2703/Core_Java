//Abstract method collection of(variables,abstract method,concrete method,blocks,constructor,features)

package p1;

public abstract class AClass {
	public int p=10;

	public abstract void m1(int a,int b);
	public abstract void m4(int x);
	public void m2() //non static concrete method
	{
		System.out.println("======NON-STATIC CONCRETE METHOD======");
	}
	public static void m3() //static concrete method
	{
		System.out.println("======STATIC CONCRETE METHOD======");
	}
	static  //static block
	{
		System.out.println("======STATIC BLOCK======");
	}
	
	{	//instance block
		System.out.println("======NON-STATIC BLOCK======");
	}
	public AClass()
	{
		System.out.println("======CONSTRUCTOR=======");
	}
	
}
