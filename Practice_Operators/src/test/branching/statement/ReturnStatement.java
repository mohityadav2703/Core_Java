// it is used to transferring statement which is used to stop the 
// continuity of method execution

package test.branching.statement;

public class ReturnStatement {
	public static void main(String[] args) {
		System.out.println("Hiii");
		if(10>2) {
			return;
		}
		
		//Dead Code
		System.out.println("Bye!!!");
	}

}
