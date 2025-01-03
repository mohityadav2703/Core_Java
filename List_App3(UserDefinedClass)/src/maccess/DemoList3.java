package maccess;
import test.*;
import java.util.*;
@SuppressWarnings("serial")
public class DemoList3 extends Exception{
	public DemoList3(String msg)
	{
		super(msg);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s)
		{
			try
			{
				Vector<BookDetails> ob =new Vector<BookDetails>();
				System.out.println("Enter The Number Of Books :");
				int n=Integer.parseInt(s.nextLine());
				System.out.println("Enter "+n+" BookDetails...");
				int i=1;
				while(i<=n)
				{
					try
					{
						System.out.println("-------BookDetails-"+i+"-------");
						System.out.println("Enter The Code :");
						String code=s.nextLine();
						System.out.println("Enter The Name :");
						String name=s.nextLine();
						System.out.println("Enter The Author :");
						String author=s.nextLine();
						System.out.println("Enter The Price :");
						float price=Float.parseFloat(s.nextLine());
						if(price<=0)
						{
							throw new DemoList3("Invalid price..");
						}
						System.out.println("Enter The qty :");
						int qty=Integer.parseInt(s.nextLine());
						if(qty<=0)
						{
							throw new DemoList3("Invalid qty....");
						}
						ob.add(new BookDetails(code,name,author,price,qty));
						System.out.println("BookDetails added successfully....");
						i++;
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
				}//end of loop
				System.out.println("========BookDetails========");
				ob.forEach((k)->
				{
					System.out.println(k);
				});
				while(true)
				{
					System.out.println("******SortingProcess*******");
					System.out.println("\t1.SortByCode"+"\n\t2.SortByName"+"\n\t3.SortByAuthor"+"\n\t4.SortByPrice"+"\n\t5.SortByQty"+"\n\t6.Exit");
					
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}//end of try with resource

	}

}
