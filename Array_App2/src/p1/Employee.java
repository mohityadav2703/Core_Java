package p1;
public class Employee extends Object{
	String id,name,desg;
	int sal;
	
	public Employee(String id,String name,String desg,int sal)
	{
		this.id=id;
		this.name=name;
		this.desg=desg;
		this.sal=sal;
	}
	public String toString()
	{
		return id+"\t"+name+"\t"+desg+"\t"+sal;
	}
	
}
