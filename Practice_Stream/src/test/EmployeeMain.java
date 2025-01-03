package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	String gender;
	int age;
	double salary;

	public Employee(int id, String name, String gender, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.addAll(Arrays.asList(new Employee(101, "Mohit", "Male", 26, 55000.00),
				new Employee(102, "Nihit", "Male", 06, 70000.00), 
				new Employee(103, "Divisha", "Female", 02, 85000.00),
				new Employee(104, "Murari", "Male", 01, 90000.00),
				new Employee(105, "Rithanya", "Female", 01, 100000.00)));

		

		// Get Highest Salary
		Employee highSal=emp.stream().max(Comparator.comparing(Employee ::getSalary)).orElseThrow(NoSuchElementException :: new);
		System.out.println(highSal.getName()+" "+highSal.getSalary());
		//or
		Optional<Employee> highSalary=emp.stream().max(Comparator.comparing(Employee ::getSalary));
		highSalary.ifPresent(e-> System.out.println(e.getName()+" "+e.getSalary()));
		System.out.println("--------------------------------------------------------");
		
		// add 500 to male employee
		emp.stream().filter(i-> i.getGender()=="Male").map(i-> i.getName()+" "+i.getSalary()).forEach(System.out ::println);
		System.out.println("--------------------------------------------------------");
		
		// after adding 2000 to all employees new salary
		emp.stream().map(i-> i.getName()+" "+i.getSalary()+" "+(i.getSalary() + 2000)).forEach(System.out ::println);	
		System.out.println("--------------------------------------------------------");
		
		// Gender wise average Salary
		Map<String, Double> genWiseAvgSal=emp.stream().collect(Collectors.groupingBy(Employee ::getGender, Collectors.averagingDouble(Employee ::getSalary)));	
		System.out.println("GenWise Average Salary  :"+genWiseAvgSal);
		System.out.println("--------------------------------------------------------");

		// Male Employee average salary
		Double maleAvgSal=emp.stream().filter(i-> i.getGender()=="Male").collect(Collectors.averagingDouble(Employee ::getSalary));
		System.out.println("Male Employee Avg Salary :"+maleAvgSal);
		System.out.println("--------------------------------------------------------");

		// Female Employee Average Salary
		Double femaleAvgSalary= emp.stream().filter(i-> i.getGender()=="Female").collect(Collectors.averagingDouble(Employee ::getSalary));
		System.out.println("Female Average Salary :"+ femaleAvgSalary);
		System.out.println("--------------------------------------------------------");

		// add 20% to the employee salary(0.20)
		emp.stream().map(i-> i.getName()+" "+i.getSalary()+" "+(i.getSalary()+(0.20*i.getSalary()))).forEach(System.out ::println);
		
		// Gender wise Number of Employees
		Map<String, Long> genWiseEmp=emp.stream().collect(Collectors.groupingBy(Employee ::getGender, Collectors.counting()));
		System.out.println("Gender Wise Employee :"+genWiseEmp);
		
		// 2nd Highest Salary						//comparator- sort data in desc order based on salary										
		Optional<Employee> secHighSal=emp.stream().sorted((e1,e2)-> Double.compare(e2.getSalary(), e1.getSalary())).skip(1).findFirst();
		secHighSal.ifPresent(e-> System.out.println(e.getName()+" "+e.getSalary()));
		
		
	}
}
