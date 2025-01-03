package test;
public class ProductValues {
	public String name;
	public float price;
	public int qty;
	public ProductValues(String name,float price,int qty)
	{
		this.name=name;
		this.price=price;
		this.qty=qty;
	}
	public String toString()
	{
		return name+"\t"+price+"\t"+qty;
	}
}
