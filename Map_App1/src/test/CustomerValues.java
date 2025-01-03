package test;
public class CustomerValues {
	public String name,mailId,city;
	public long phNo;
	public CustomerValues(String name,String mailId,String city,long phNo)
	{
		this.name=name;
		this.city=city;
		this.mailId=mailId;
		this.phNo=phNo;
	}
	public String toString()
	{
		return name+"\t"+city+"\t"+mailId+"\t"+"phNo";
	}
}
