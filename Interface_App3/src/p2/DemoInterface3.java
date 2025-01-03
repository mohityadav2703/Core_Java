package p2;
import p1.*;

public class DemoInterface3 {

	public static void main(String[] args) {
		IClass ob = new IClass();
		ob.m1(11);
		ITest.m2(12); // static concrete method 
	//	IClass.m2(13);
		ob.m3(13); // default concrete method

	}

}
