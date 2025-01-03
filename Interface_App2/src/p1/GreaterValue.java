package p1;

public class GreaterValue implements IComparable
{
	public int compareTo(int x,int y)
	{
		if(x>y)
			return x;
		else
			return y;
	}
}
