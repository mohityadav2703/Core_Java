package p1;

public class Access 
{
	public static IArithmetic getRef(int choice)
	{
		return switch(choice)
		{
					//Addition class as Anonymous
		case 1: yield new IArithmetic()
		{
			public int calculate(int x,int y)
			{
				return x+y;
			
			}
		};
		case 2:
					//Subtraction class As Anonymous
			yield new IArithmetic()
			{
				public int calculate(int x,int y)
				{
					return x-y;
				}
			};
		case 3:
					//Multiply class as anonymous
			yield new IArithmetic()
			{
				public int calculate(int x,int y)
				{
					return x*y;
				}
			};
		case 4:
			       //divide class as anonymous
			yield new IArithmetic()
			{
				public int calculate(int x,int y)
				{
					return x/y;
				}
			};
		case 5:
			     //ModDiv class as Anonymous
			yield new IArithmetic()
			{
				public int calculate(int x,int y)
				{
					return x%y;
				}
			};
			default :
				yield null;
			
		};//end of switch
	}
}
