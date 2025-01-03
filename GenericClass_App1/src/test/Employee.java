package test;
public class Employee extends Object{
	public String id,name,desg;
	public int sal;
	
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
