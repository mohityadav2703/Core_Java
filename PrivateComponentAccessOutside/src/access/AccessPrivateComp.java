package access;
import test.*;

public class AccessPrivateComp {
	public static void main(String[] args) {
		PrivateComponent pc = new PrivateComponent();
		pc.privateAccess();
		
		PrivateComp pc1 = new PrivateComp();
		System.out.println(pc1.getX());
		System.out.println(pc1.getY());
	}

}
