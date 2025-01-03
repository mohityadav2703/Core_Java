package maccess;
public class DemoWrapperClass3 {

	public static void main(String[] args) {
		//AutoBoxing Process
		Integer ob1=12;
	//	Integer ob2="13";  Error
		Float ob3 = 12.34F;
	//	Float ob4 ="13.76F";  Error
		Character ob5 = 'A';
		Boolean ob6 = true;
	//	Boolean ob7 = "true";	Error
		
		System.out.println("********AUTOBOXING PROCESS**********");
		System.out.println("Data In ob1 :"+ob1.toString());
		System.out.println("Data In ob3 :"+ob3.toString());
		System.out.println("Data In ob5 :"+ob5.toString());
		System.out.println("Data In ob6 :"+ob6.toString());
		
		//AutoUnBoxing Process
		int i1 = ob1;
		float f1 = ob3;
		char ch = ob5;
		boolean b1 = ob6;
		System.out.println("*******AUTO-UNBOXING PROCESS********");
		System.out.println("Data in i1 :"+i1);
		System.out.println("Data in f1 :"+f1);
		System.out.println("Data in ch :"+ch);
		System.out.println("Data in b1 :"+b1);
	}

}
