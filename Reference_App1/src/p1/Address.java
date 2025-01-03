package p1;

public class Address 
{
	public String hNo,sName,city,state;
	public int pinCode;
	
	public void getAddress()
	{
		System.out.println("******AddressDetails******");
		System.out.println("HouseNumber :"+hNo);
		System.out.println("StreetName :"+sName);
		System.out.println("City :"+city);
		System.out.println("State :"+state);
		System.out.println("PinCode :"+pinCode);
	}
}
