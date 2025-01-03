package test;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee1{
	Integer empId;
	String empName;
	String empGen;
	String empDesg;
	Double empSalary;
	
	Employee1(Integer empId,String empName, String empGen, String empDesg, Double empSalary){
		this.empId=empId;
		this.empName=empName;
		this.empGen=empGen;
		this.empDesg=empDesg;
		this.empSalary=empSalary;
	}
}

public class Predicate_Employee {
	public static void main(String[] args) {
		ArrayList<Employee1> list=new ArrayList<Employee1>();
		list.add(new Employee1(101,"Mohit","Male","SE",10000.00));
		list.add(new Employee1(102,"Nihit","Male","TE",11000.00));
		list.add(new Employee1(103,"Chillu","Female","SE",19000.00));
		list.add(new Employee1(104,"Chandan","Male","SDE",13000.00));
		list.add(new Employee1(105,"Deepak","Male","MA",15000.00));
		list.add(new Employee1(106,"Ridhi","Female","QA",11000.00));
		list.add(new Employee1(107,"Pratyusha","Female","MA",17000.00));
	
		Predicate<Employee1> p = e -> e.empSalary>13000.00 && e.empGen=="Female";
		for(Employee1 e1 : list) {
			if(p.test(e1)) {
				System.out.println(e1.empId+" "+e1.empName+" "+e1.empGen+" "+e1.empDesg+" "+e1.empSalary);
			}
		}
	}
}
