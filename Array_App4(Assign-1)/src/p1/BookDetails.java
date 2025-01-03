package p1;
public class BookDetails {
	public String bid,bname,bauthor;
	float bprice;
	int bqty;
	
	public BookDetails(String bid,String bname,String bauthor,float bprice,int bqty)
	{
		this.bid=bid;
		this.bname=bname;
		this.bauthor=bauthor;
		this.bprice=bprice;
		this.bqty=bqty;
	}
	public String display()
	{
		return bid+"\t"+bname+"\t"+bauthor+"\t"+bprice+"\t"+bqty;
	}
}
