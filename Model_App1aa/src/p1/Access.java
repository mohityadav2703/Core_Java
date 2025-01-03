package p1;

public class Access 
{
	public static IComparable getRef(int choice)
	{
		return switch(choice)
		{
					//GreaterValue class as Anonymous
		case 1: yield new IComparable()
						{
							public int compareTo(int x,int y)
							{
								if(x>y) return x;
								else return y;
							}
						};
					//SmallerValue class as Anonymous	
		case 2: yield new IComparable()
						{
							public int compareTo(int x,int y)
							{
								if(x<y)
									return x;
								else
									return y;
							}
						};
		default : yield null;
		};
	}//outer class method
}//outer class
