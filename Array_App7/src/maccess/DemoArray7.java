package maccess;
import java.util.*;
public class DemoArray7 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			try
			{
				Integer a[][]=new Integer[3][3];
				System.out.println("Enter 3X3 Matrix:");
				for(int i=0;i<=2;i++)
				{
					for(int j=0;j<=2;j++)
					{
						a[i][j]=new Integer(s.nextInt());
					} //internal loop(column)
				}//outer loop(row)
				System.out.println("Display 3X3 Matrix");
				for(int i=0;i<=2;i++)
				{
					for(int j=0;j<=2;j++)
					{
						System.out.print(a[i][j].toString());
					} //inner loop
					System.out.println();
				}//outer loop
				System.out.println("\n*******SplIterator<T>********");
				Spliterator<Integer[]> sp = Arrays.spliterator(a);
				sp.forEachRemaining((k)->
				{
					Spliterator<Integer> sp2 =Arrays.spliterator(k);
					sp2.forEachRemaining((z)->
						{
							System.out.print(z.toString());
						});
						System.out.println();
					});
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}//end of try with Resource
	}

}
