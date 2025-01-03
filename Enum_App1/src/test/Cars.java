package test;
public enum Cars {
	figo(800),alto(500),dezire(700);
	public int price;
	private Cars(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
}
