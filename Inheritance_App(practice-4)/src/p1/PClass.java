package p1;

public class PClass {
	//parameterized constructor
	public PClass(int a,int b)
	{
		System.out.println("==========Para-Cons of PClass============");
		System.out.println("The Value of x:"+a);
		System.out.println("The Value of y:"+b);
	}
	//instance method
	public void pm()
	{
		System.out.println("===========This is Instance Method ofPClass==========");
	}
	public static void pm1()
	{
		System.out.println("===========This is Static Method Of PClass============");
	}
	//static block
	static
	{
		System.out.println("===========Static-Block of Pclass==========");
	}
	//instance block
	{
		System.out.println("===========Instance-Block Of PClass============");
	}
}
