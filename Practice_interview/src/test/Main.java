//find the sequence of output

package test;

class Base{
	public void print() {
		System.out.println("Base");
	}
}
class Derived extends Base{
	public void print() {
		System.out.println("Derived");
	}
}
public class Main {
	public static void DoPrint(Base o) {
		o.print();											
	}
															
	public static void main(String[] args) {
		Base x = new Base();								
		Base y = new Base();
		Derived d = new Derived();
		Derived d1=new Derived();
		DoPrint(x);
		DoPrint(y);
		DoPrint(d);
		DoPrint(d1);
	}
}
