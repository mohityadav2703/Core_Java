package maccess;
import java.util.*;
public class DemoList2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s)
		{
			try 
			{
				LinkedList<String> ob =new LinkedList<String>();
				System.out.println("Enter The Number of Strings :");
				int n=Integer.parseInt(s.nextLine());
				System.out.println("Enter "+n+" Strings..");
				for(int i=1;i<=n;i++)
				{
					ob.add(s.nextLine());
				}//end of loop
				System.out.println("=======forEach()========");
				ob.forEach((k)->
				{
					System.out.println(k);
				});
				System.out.println("========After Sorting========");
				Collections.sort(ob);
				ob.forEach((k)->
				{
					System.out.println(k);
				});
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}//end of try with resource

	}

}
