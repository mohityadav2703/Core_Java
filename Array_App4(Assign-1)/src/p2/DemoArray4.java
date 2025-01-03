package p2;
import p1.BookDetails;
import java.util.*;
public class DemoArray4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			try
			{
				System.out.println("Enter The Number of Books:");
				int n=Integer.parseInt(s.nextLine());
				BookDetails bd[]=new BookDetails[n];
				System.out.println("Enter "+n+" Book Details:");
				for(int i=0;i<bd.length;i++)
				{
					System.out.println("Enter The Details Of Book-"+(i+1));
					System.out.println("Enter The BookId");
					String bid=s.nextLine();
					System.out.println("Enter The BookName:");
					String bname=s.nextLine();
					System.out.println("Entet The BookAuthor:");
					String bauthor=s.nextLine();
					System.out.println("Enter The BookPrice:");
					float bprice=Float.parseFloat(s.nextLine());
					System.out.println("Enter The BookQty");
					int bqty=Integer.parseInt(s.nextLine());
					
					bd[i]=new BookDetails(bid,bname,bauthor,bprice,bqty);
				}//end of loop
				System.out.println("===========BookDetails===========");
				Spliterator<BookDetails> sp = Arrays.spliterator(bd);
				sp.forEachRemaining((k)->
				{
					System.out.println(k.display());
				});
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
		}//end of try with resource

	}

}
