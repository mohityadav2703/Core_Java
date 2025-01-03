package test;

public class PAddition 
{
	private int add(int x,int y)
	{
		return x+y;
	}
	private int add(int x,int y,int z)
	{
		return x+y+z;
	}
	public void access(int x,int y,int z)
	{
		System.out.println("Sum1 :"+this.add(x,y));
		System.out.println("Sum2 :"+this.add(x,y,z));
	}
}
