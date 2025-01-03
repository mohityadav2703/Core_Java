/*Def :when we call method by passing object as argument is known as method 
 * references how many times we call method, every time original value will
 * be change.
*/
package object;

public class CallByReference {
	int data = 50;
	
	void change(CallByReference cbr) {
		cbr.data=cbr.data+100; //changes will be in the instance variable
	}
	public static void main(String[] args) {
		CallByReference cbr = new CallByReference();
		System.out.println("Before Change :"+cbr.data);
		
		cbr.change(cbr); //  150->  passing object
		System.out.println("After Chage :"+cbr.data);
		
		cbr.change(cbr); //  250->  passing object
		System.out.println(cbr.data);
		
		cbr.change(cbr); //  350->  passing object
		System.out.println(cbr.data);
		
	}

}
