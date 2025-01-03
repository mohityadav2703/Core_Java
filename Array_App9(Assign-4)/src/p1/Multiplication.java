package p1;
public class Multiplication {
	public Integer[][] multiply(Integer a[][],Integer b[][])
	{
		Integer c[][]=new Integer[3][3];
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				c[i][j]=a[i][j]*b[j][i];
			}
		}
		return c;
	}
}
