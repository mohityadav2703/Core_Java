package test;

public class Display1 {

	private static Display1 ob=null;
	private Display1()
	{
		
	}
	static
	{
		ob=new Display1();
	}
	public static Display1 getRef()
	{
		return ob;
	}
	public void dis(int k)
	{
		System.out.println("****Instance dis(k)****");
		System.out.println("The Value Of K :"+k);
	}
}
