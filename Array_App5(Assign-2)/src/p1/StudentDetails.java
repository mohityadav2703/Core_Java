package p1;
public class StudentDetails {
	public String id,name,branch,addr,eid;
	public int fee;
	public long phno;
	
	public StudentDetails(String id,String name,String branch,String addr,String eid,int fee,long phno)
	{
		this.id=id;
		this.name=name;
		this.branch=branch;
		this.addr=addr;
		this.eid=eid;
		this.fee=fee;
		this.phno=phno;
	}
	public String display()
	{
		return id+"\t"+name+"\t"+branch+"\t"+addr+"\t"+eid+"\t"+fee+"\t"+phno;
	}
}
