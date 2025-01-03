package p1;
public class Selection {
	public void select(int n,String name)
	{
		if(n<=Available.available)
		{
			System.out.println(n+" Ticket booked Successfully by "+name);
			Available.available=Available.available-n;
		}
		else
		{
			System.out.println("Sorry ! No Tickets Available For "+name);
		}
	}
}
