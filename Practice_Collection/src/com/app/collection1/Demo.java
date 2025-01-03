package com.app.collection1;

import java.lang.reflect.Field;

class Employee{
	private int empId=10;
	private String name="Mohit";
	int age=20;
	
	
	public int getEmpId() {
		return empId;
	}

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}



	public void access() {
		int k=this.empId;
		String l=this.name;
		int m=this.age;
		System.out.println(k+"\t"+l+"\t"+m);
		
	}
}

public class Demo{
	public static void main(String[] args) throws Exception {
		
		System.out.println("By using getter method : way-1");
		Employee e1 = new Employee();
		System.out.println(e1.getEmpId()+ "\t" +e1.getName());
		
		System.out.println("By using method call: way-2");
		Employee e2 = new Employee();
		e2.access();
		
		System.out.println("By using Reflection Api : way-3");
		
		Class clz=Class.forName("com.app.collection1.Employee");
//		System.out.println(clz);
		
		Object instance = clz.newInstance();
		Employee emp = (Employee) instance;
		
		//accessing private variable
		Field field=clz.getDeclaredField("empId");
		field.setAccessible(true);
		field.set(emp, 10);
		System.out.println(field.get(emp));
		

	
		
	}
}
