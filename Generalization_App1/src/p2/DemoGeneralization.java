// Generalization means converting child class object into parent class

package p2;
import p1.*;

public class DemoGeneralization {

	public static void main(String[] args) 
	{
		PClass ob =(PClass)new CClass(); 
		ob.m1(12);
		ob.m2(13);
	//	ob.m3(14); Error
	}

}
