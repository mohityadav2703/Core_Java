package test;
public class BookDetails {
	public String code,name,author;
	public float price;
	public int qty;
	public BookDetails(String code,String name,String author,float price,int qty)
	{
		this.code=code;
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
	}
	public String toString()
	{
		return code+"\t"+name+"\t"+author+"\t"+price+"\t"+qty;
	}
}
