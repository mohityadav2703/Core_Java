package p1;

public class P_class 
{
	public static int k;
	
	// P_class static block
	static 
	{
		System.out.println("*****P_class static block*****");
		System.out.println("The Value Of k :"+k);
	}
	// P_class Instance Block
	{
		System.out.println("****P_class Instance block****");
		System.out.println("The Value Of K :"+k);
	}
	
}
