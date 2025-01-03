//constructor overloading process

package p1;

public class PClass {

	public PClass(int a,int b)
	{
		this (a);
		System.out.println("The value of b :"+b);
	}
	public PClass(int a)
	{
		System.out.println("The Value of a :"+a);
	}
}
