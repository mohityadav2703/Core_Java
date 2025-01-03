package p1;

public class P_class 
{
	public static int k;
	
	//static block
	static
	{
		System.out.println("****** P_class static block ******");
		System.out.println("The value of k:"+k);
	}
	
	// instance block
	{
		System.out.println("*****P_class instance block *******");
		System.out.println("The Value of k :"+k);
	}
}
