package p1;

public interface Transaction 
{
	public static final Balance b = new Balance();
	public void process(int amt);
}
