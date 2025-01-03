package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMain {
	public static void main(String[] args) {
		
		ArrayList<Employee> empList=new ArrayList<Employee>();
	    empList.addAll(Arrays.asList(new Employee(1,"A",12,"M",20000),
		                             new Employee(2,"B",15,"F",15000),
		                             new Employee(3,"C",10,"M",12000),
		                             new Employee(4,"D",24,"F",30000)));	
	    
	    Map<String,Long> collect= empList.stream().collect(Collectors.groupingBy(Employee :: getGender,Collectors.counting()));
	    System.out.print("Number of Employee Gender Wise :");
	    System.out.println(collect);
	    
	    System.out.print("\nFind The Average Salary of Employee Gender Wise :");
	    Map<String,Double> collect1=empList.stream().collect(Collectors.groupingBy(Employee :: getGender, Collectors.averagingDouble(Employee ::getSalary)));
	    System.out.println(collect1);
	   
	  
	    System.out.println("\nSorting By Age :");
	    List<Employee> resList= empList.stream().sorted(Comparator.comparing(Employee :: getAge)).collect(Collectors.toList());
		resList.forEach(ele ->System.out.println("\tAge ="+ele.getAge()+" Name ="+ele.getName()));
	}
}
