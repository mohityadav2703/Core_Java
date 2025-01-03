package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	int age;
	String gender;
	double salary;
	
	public Employee(int id, String name, int age, String gender, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

public class EmployeeMain {

	public static void main(String[] args) {
		ArrayList<Employee> emp= new ArrayList<Employee>();
		emp.addAll(Arrays.asList(
				new Employee(101,"Mohit",25,"Male",2300.0),
				new Employee(102,"Nihit",05,"Male",3000.0),
				new Employee(103,"Chillu",02,"Female",5000.0),
				new Employee(104,"Anjali",18,"Female",1000.0),
				new Employee(105,"Pushpanjali",25,"Female",500.0),
				new Employee(106,"Chandan",36,"Male",2500.0),
				new Employee(107,"Deepak",37,"Male",2500.0)	
				));
		Map<String,Long> list=emp.stream().collect(Collectors.groupingBy(Employee :: getGender, Collectors.counting()));
		System.out.println(list);
		
		Map<String,Double> list1=emp.stream().collect(Collectors.groupingBy(Employee :: getGender, Collectors.averagingDouble(Employee ::getSalary)));
		System.out.println(list1);
		
		List<Employee> empList=emp.stream().sorted(Comparator.comparing(Employee ::getAge)).collect(Collectors.toList());
		empList.forEach(k-> System.out.println(k.getId() +" "+k.getName()+" "+k.getAge()));
		
		List<Double> sal=emp.stream().filter(k-> k.getSalary()<2500).map(i-> i.getSalary()+200).collect(Collectors.toList());
		sal.forEach(System.out::println);
		
		emp.stream().filter(k-> k.getGender()=="Female").map(i-> i.getSalary()-200).collect(Collectors.toList()).forEach(System.out::println);
		
	}
}
