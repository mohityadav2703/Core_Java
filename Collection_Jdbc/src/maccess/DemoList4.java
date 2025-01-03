package maccess;
import test.*;
import java.util.*;
public class DemoList4 extends Exception{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			try
			{
										//anonymous object
				Vector<BookDetails> v=new RetrieveBookDetails().retrieve();
				System.out.println("=======BookDetails from DB Table=======");
				v.forEach((k)->
				{
					System.out.println(k);
				});
				while(true)
				{
					System.out.println("*****Sorting Process******");
					System.out.println("\t1.SortByCode"+"\n\t2.SortByName"+"\n\t3.SortByAuthor"+"\n\t4.SortByPrice"+"\n\t5.SortByQty"+"\n\t6.Exit");
					System.out.println("Enter the Choice:");
					switch(Integer.parseInt(s.nextLine()))
					{
					case 1:
						v.sort(new SortByCode());
						v.forEach((k)->
						{
							System.out.println(k);
						});
						break;
					case 2:
						v.sort(new SortByName());
						v.forEach((k)->
						{
							System.out.println(k);
						});
						break;
					case 3:
						v.sort(new SortByAuthor());
						v.forEach((k)->
						{
							System.out.println(k);
						});
						break;
					case 4:
						v.sort(new SortByPrice());
						v.forEach((k)->
						{
							System.out.println(k);
						});
						break;
					case 5:
						v.sort(new SortByQty());
						v.forEach((k)->
						{
							System.out.println(k);
						});
						break;
					case 6:
						System.out.println("Operation Stopped...");
						System.exit(0);
						break;
						default:
							System.out.println("Invalid Choice...");
					}
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}//end of try with resource

	}

}
