package p1;
import java.util.Scanner;

public class WriteData 
{
	// instance variable
	public BookDetails bd = null;
	
	public WriteData (BookDetails bd)
	{
		this.bd=bd;
	}
	public void readBookDetails(Scanner s)
	{
		System.out.println("Enter The BookCode :");
		bd.bCode=s.nextLine();
		System.out.println("Enter The BookName :");
		bd.bName=s.nextLine();
		System.out.println("Enter The BookAuthor :");
		bd.bAuthor=s.nextLine();
		System.out.println("Enter The BookPrice :");
		bd.bPrice=Float.parseFloat(s.nextLine());
		System.out.println("Enter The BookQty :");
		bd.bQty=Integer.parseInt(s.nextLine());
	}
}
