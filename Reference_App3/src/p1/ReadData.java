package p1;

public class ReadData
{
	// instance variable
	public BookDetails bd=null;
	// Constructor to initialize instance variable
	public ReadData(BookDetails bd)
	{
		this.bd=bd;
	}
	// instance method
	public void disBookDetails()
	{
		bd.getBookDetails();
	}
}
