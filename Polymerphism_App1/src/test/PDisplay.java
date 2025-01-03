package test;

public class PDisplay 
{
	private int k=10;
	private PDisplay()
	{
		
	}
	public static PDisplay ob = new PDisplay();

	private void dis()
	{
		System.out.println("*******Private dis()*******");
		System.out.println("The value of k :"+k);
	}
	
	
	public void access()
	{
		this.dis();
		System.out.println("*****Access()******");
		System.out.println("The value of k :"+k);	
	}
}
