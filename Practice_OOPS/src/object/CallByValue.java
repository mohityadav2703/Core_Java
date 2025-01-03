/* Def : when we call method by passing value as an argument, this is known as 
 * 		 call by value. Here original value will not be change.
 */

package object;

public class CallByValue {

	int data=50;
	
	void change(int data) {
		data=data+100;		//change will be happen on local variable only
	}
	
	public static void main(String[] args) {
		CallByValue cbv = new CallByValue();
		System.out.println("Before change :"+cbv.data);
		
		cbv.change(100);  //calling method by passing value
		System.out.println("After change :"+cbv.data);
		
		cbv.change(200);  //calling method by passing value
		System.out.println("Again Call Change() :"+cbv.data);
	}
}
