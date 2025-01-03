package maccess;
import test.*;

public class DemoGeneric1 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		System.out.println("*********Integer*********");
		Display<Integer> ob1=new Display<Integer>();
		ob1.setOb(new Integer(12));
		System.out.println("Value :"+ob1.getOb());
		
		System.out.println("********String***********");
		Display<String> ob2=new Display<String>();
		ob2.setOb(new String("nit-hyderabad"));
		System.out.println("Value :"+ob2.getOb());
		
		System.out.println("********Employee**********");
		Display<Employee> ob3=new Display<Employee>();
		ob3.setOb(new Employee("A111","RAJ","SE",1200));
		System.out.println("Value :"+ob3.getOb());
	}

}
