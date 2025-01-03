package maccess;
public class DemoWrapperClass2 {
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		//Boxing Process
		Integer ob1=new Integer(12);
		Integer ob2=new Integer("23");
		
		Float ob3 = new Float(12.57F);
		Float ob4 = new Float("34.79");
		
		Character ob5 = new Character('A');
		
		Boolean ob6 = new Boolean(true);
		Boolean ob7=new Boolean("true");
		System.out.println("*****Boxing*******");
		System.out.println("Data in ob1 :"+ob1.toString());
		System.out.println("Data in ob2 :"+ob2.toString());
		System.out.println("Data in ob3 :"+ob3.toString());
		System.out.println("Data in ob4 :"+ob4.toString());
		System.out.println("Data in ob5 :"+ob5.toString());
		System.out.println("Data in ob6 :"+ob6.toString());
		System.out.println("Data in ob7 :"+ob7.toString());
		
		//UnBoxing Process
		int i1 = ob1.intValue();
		int i2 = ob2.intValue();
		float f1 = ob3.floatValue();
		float f2 = ob4.floatValue();
		char ch = ob5.charValue();
		boolean b1 = ob6.booleanValue();
		boolean b2 = ob7.booleanValue();
		System.out.println("*****UnBoxing*******");
		System.out.println("Data in i1 :"+i1);
		System.out.println("Data in i2 :"+i2);
		System.out.println("Data in f1 :"+f1);
		System.out.println("Data in f2 :"+f2);
		System.out.println("Data in ch :"+ch);
		System.out.println("Data in b1 :"+b1);
		System.out.println("Data in b2 :"+b2);
		
	}

}
