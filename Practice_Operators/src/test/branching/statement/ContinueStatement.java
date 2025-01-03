// it is used to skip the current iteration of the loop. 
// it jumps to the next iteration of the loop immediately

package test.branching.statement;

public class ContinueStatement {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==7) {
				continue;
			}
			System.out.print(i+" ");
		}
	}

}
