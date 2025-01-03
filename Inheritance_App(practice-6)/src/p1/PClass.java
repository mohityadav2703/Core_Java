//Instance Method Overloading Process

package p1;

public class PClass {
 
	public void m(int a,int b)
	{
		this.m(a);
		System.out.println("The value of b :"+b);
	}
	public void m(int a)
	{
		System.out.println("The value of a :"+a);
	}
}
