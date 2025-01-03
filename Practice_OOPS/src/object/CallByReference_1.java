package object;

public class CallByReference_1 {
	int data=50;
	
	void change(CallByReference_1 cbr) {
		cbr.data=cbr.data+100;
	}
	
	public static void main(String[] args) {
		CallByReference_1 cbr = new CallByReference_1();
		System.out.println("Before Change data value is :"+cbr.data);
		
		cbr.change(cbr); //calling method by passing object
		System.out.println("After Change data value is :"+cbr.data);
		
		cbr.change(cbr); //calling method by passing object
		System.out.println("Again Call change() then data value is :"+cbr.data);
	}

}
