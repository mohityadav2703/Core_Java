package p1;

public class BookDetails 
{
	public String bCode,bName,bAuthor;
	public float bPrice;
	public int bQty;
	
	// Instance Method
	public void getBookDetails()
	{
		System.out.println("*******BookDetails*********");
		System.out.println("BoolCode :"+bCode);
		System.out.println("BookName :"+bName);
		System.out.println("BookAuthor :"+bAuthor);
		System.out.println("BookPrice :"+bPrice);
		System.out.println("BookQty :"+bQty);
	}

}
