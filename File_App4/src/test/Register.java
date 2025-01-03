package test;
import java.io.*;
import java.util.*;
@SuppressWarnings("serial")
public class Register extends Object implements Serializable{
	public String uName,pWord,name;
	public Date dTime;
	public Register(String uName,String pWord,String name,Date dTime)
	{
		this.uName=uName;
		this.pWord=pWord;
		this.name=name;
		this.dTime=dTime;
	}
	public String Display()
	{
		return "UserName :"+uName+"\nPassWord :"+pWord+"\nName :"+name+"\nDate :"+dTime;
	}
}
