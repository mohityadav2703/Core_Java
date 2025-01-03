package maccess;

public class DemoTypeCasting {

	public static void main(String[] args) {
		char ch1 = 'H';
		int val =(int)ch1; //upcasting process or implicit
		System.out.println("ASCII value of H : "+val);
		
		int val2= 86;
		char ch2 = (char)val2; //downcasting process of explicit
		System.out.println("Char at value 86 :"+ch2);
	}

}
