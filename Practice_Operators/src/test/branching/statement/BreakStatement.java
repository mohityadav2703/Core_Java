// it is used to break the current execution of the program

package test.branching.statement;

public class BreakStatement {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==8) {
				break;
			}
			System.out.print(i+" ");
		}
	}

}
