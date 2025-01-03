package maccess;
public class DemoWrapper1 {
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		//Boxing Process
		Integer ob1 = new Integer(12); //int_As_para
		
		Integer ob2 = new Integer("23"); //str_As_para
		
		Float ob3 = new Float(12.54F); //int_As_para
		Float ob4= new Float("23.46"); //str_As_para
		
		Long ob5 = new Long(1234567788);
		Long ob6 = new Long("0987654321");
		
		Character ob7 = new Character('A');
		
		Boolean ob8 = new Boolean(true);
		Boolean ob9 = new Boolean("false");
		
		Double ob10 = new Double(27651.98947);
		Double ob11 = new Double("673427.98298");
		
		Byte ob12 = new Byte((byte) 'a');
		
		System.out.println("Data In Ob1 :"+ob1.toString());
		System.out.println("Data In Ob2 :"+ob2.toString());
		System.out.println("Data In Ob3 :"+ob3.toString());
		System.out.println("Data In Ob4 :"+ob4.toString());
		System.out.println("Data In Ob5 :"+ob5.toString());
		System.out.println("Data In Ob6 :"+ob6.toString());
		System.out.println("Data In Ob7 :"+ob7.toString());
		System.out.println("Data In Ob8 :"+ob8.toString());
		System.out.println("Data In Ob9 :"+ob9.toString());
		System.out.println("Data In Ob10 :"+ob10.toString());
		System.out.println("Data In Ob11:"+ob11.toString());
		System.out.println("Data In Ob12 :"+ob12.toString());

	}

}
