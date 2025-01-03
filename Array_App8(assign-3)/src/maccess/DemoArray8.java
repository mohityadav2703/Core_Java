package maccess;
import test.Addition;
import java.util.*;
public class DemoArray8 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			try
			{
				Integer a[][]=new Integer[3][3];
				Integer b[][]=new Integer[3][3];
				System.out.println("****3X3 Matrix(A)****");
				for(int i=0;i<=2;i++)
				{
					for(int j=0;j<=2;j++)
					{
						a[i][j]=new Integer(s.nextInt());
					}
				}
				System.out.println("****3X3 Matrix(B)****");
				for(int i=0;i<=2;i++)
				{
					for(int j=0;j<=2;j++)
					{
						b[i][j]=new Integer(s.nextInt());
					}
				}
				Addition ad=new Addition();
				Integer c[][]=ad.add(a, b); //Array As parameter
				System.out.println("****3X3 Matrix(c)****");
				for(int i=0;i<=2;i++)
				{
					for(int j=0;j<=2;j++)
					{
						System.out.print(c[i][j].toString()+" ");
					}
					System.out.println();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
