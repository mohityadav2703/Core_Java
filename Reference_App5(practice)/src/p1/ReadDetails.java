package p1;

public class ReadDetails {

	public StudentDetails sd=null;
	public ReadDetails(StudentDetails sd)
	{
		this.sd=sd;
	}
	public void display()
	{
		sd.getDetails();
	}
}
