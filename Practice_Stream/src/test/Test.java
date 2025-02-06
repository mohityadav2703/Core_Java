package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

class Abc {

	int id;
	String name;
	String gender;
	double sal;

	public Abc(int id, String name, String gender, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.sal = sal;
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

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

}

public class Test {
	public static void main(String[] args) {
		ArrayList<Abc> emp = new ArrayList<>();
		emp.addAll(Arrays.asList(
				new Abc(01, "mohit", "male", 200.0),
				new Abc(02, "nihit", "male", 500.90),
				new Abc(03, "rithanya", "female", 800),
				new Abc(04, "divisha", "female", 700.00)
				));
		
		//get highest salary
		Abc maxSal=emp.stream().max(Comparator.comparing(Abc::getSal)).orElseThrow(NoSuchElementException::new);
		System.out.println(maxSal.getName()+" "+maxSal.getSal());
		
		//add 500 to male employee
		emp.stream().filter(e-> e.getGender()=="male").map(e-> e.getName()+" "+e.getSal()+" "+(e.getSal()+500)).forEach(System.out::println);
		
		//add 500 to female employee
		emp.stream().filter(e-> e.getGender()=="female").map(e-> e.getName()+" "+e.getSal()+" "+(e.getSal()+(e.getSal()+500))).forEach(System.out::println);
		
		//gender wise average salary
		Map<String,Double> avgSalGenWise=emp.stream().collect(Collectors.groupingBy(Abc::getGender,Collectors.averagingDouble(Abc::getSal)));
		System.out.println(avgSalGenWise);
		
		//add 2000 to all employees
		emp.stream().map(e-> e.getName()+" "+(e.getSal()+2000)).forEach(System.out::println);
		
		//male employee average salary
		double avgSalmale=emp.stream().filter(e->e.getGender()=="male").collect(Collectors.averagingDouble(Abc::getSal));
		System.out.println(avgSalmale);
		
		//female employee average salary
		double avgSalFemale=emp.stream().filter(e-> e.getGender()=="female").collect(Collectors.averagingDouble(Abc::getSal));
		System.out.println(avgSalFemale);
		
		//add 20% hike to male employee
		emp.stream().filter(e->e.getGender()=="male").map(e-> e.getName()+" "+e.getSal()+" "+(e.getSal()+(0.20*e.getSal()))).forEach(System.out::println);
		
		//second highest salary
		
		Optional<Abc> secHighSal=emp.stream().sorted((e1,e2)-> Double.compare(e2.getSal(), e1.getSal())).skip(1).findFirst();
		secHighSal.ifPresent(e-> System.out.println(e.getName()+" "+e.getSal()));
	
		//genderwise employee Number
		Map<String, Long> genWiseEmp=emp.stream().collect(Collectors.groupingBy(Abc::getGender, Collectors.counting()));
		System.out.println(genWiseEmp);
		
	}
}
