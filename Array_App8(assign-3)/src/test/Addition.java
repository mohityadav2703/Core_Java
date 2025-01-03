package test;
public class Addition {
	public Integer[][] add(Integer a[][],Integer b[][])
	{
		Integer c[][]=new Integer[3][3];
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
}
