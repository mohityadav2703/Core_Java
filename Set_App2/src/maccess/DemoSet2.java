//Displaying prime Number
package maccess;
import java.util.*;
import java.util.function.*;
public class DemoSet2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s)
		{
			try
			{
				LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
				System.out.println("Enter The number of eles to be added:");
				int n=s.nextInt();
				System.out.println("Enter "+n+" Integer-elements..");
				for(int i=1;i<=n;i++)
				{
					lhs.add(s.nextInt());
				}//end of loop
				System.out.println("======Set<E>elements======");
				System.out.println(lhs.toString());
				
				Predicate<Integer>p=(z)->
				{
					boolean k=false;
					int count=0;
					for(int i=1;i<=z;i++)
					{
						if(z%i==0)
						{
							count++;
						}
					}//end of loop
					if(count==2)
					{
						k=true;
					}
					return k;
				};
				System.out.println("============Prime Number============");
				lhs.forEach((z)->
				{
					if(p.test(z))
					{
						System.out.print(z+" ");
					}
				});
			}//end of try
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}//end of try with resource

	}

}
