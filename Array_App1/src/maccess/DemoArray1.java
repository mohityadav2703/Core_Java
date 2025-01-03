package maccess;
import java.util.*;
public class DemoArray1 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		try(s;)
		{
			try
			{

				System.out.println("Enter The number of Integer elements:");
				int n=s.nextInt();
				Integer a[]=new Integer[n];
				System.out.println("Enter "+n+" Integer elements..");
				for(int i=0;i<a.length;i++)
				{
					a[i]=new Integer(s.nextInt());
				}
				System.out.println("*****Using Old For-loop*****");
				for(int i=0;i<a.length;i++)
				{
					System.out.print(a[i].toString()+" ");
				}
				System.out.println("\n****Using Extended-for(java5)****");
				for(Integer k :a)
				{
					System.out.print(k.toString()+" ");
				}
				System.out.println("\n*****Using spliterator<T>(java8)*****");
				Spliterator<Integer> sp = Arrays.spliterator(a);
				sp.forEachRemaining((k)->
								{
									System.out.print(k.toString()+" ");
								});
			}
			catch(InputMismatchException ime)
			{
				System.out.println("enter only integer values....");
			}
		} //end of try with resource

	}

}
