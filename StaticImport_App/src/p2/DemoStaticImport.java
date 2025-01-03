package p2;
import static p1.Display.*;
import java.util.Scanner;

public class DemoStaticImport
{
	public static int z;
	public static void show()
	{
		System.out.println("***** Method show() *****");
		System.out.println("The Value of z :"+z);
	}

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value of k:");
		k=s.nextInt();
		System.out.println("Enter The Value Of z:");
		z=s.nextInt();
		dis();
		show();
		
		s.close();
	}

}
