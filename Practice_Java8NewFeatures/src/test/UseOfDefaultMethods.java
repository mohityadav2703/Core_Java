/**
 * Default Method : We can Override defult method in implementation class without intruppting them.
 * Static Method  : We can not override static method in implementation class .
 */

package test;

import java.util.logging.Logger;

interface I{
	static final Logger logger= Logger.getLogger(I.class.getName());
	public void m1();
	public void m2();
	
	default void m3() {
		logger.info("you can override default method in implementation class");
	}
	
	public static void m4() {
		logger.info("You can not override static method in implementation class");
	}
}

class A implements I{
	private static final Logger logger= Logger.getLogger(A.class.getName());
	public void m1() {
		logger.info("Class A m1() method");
	}
	public void m2() {
		logger.info("Class A m2() method");
	}
	
	@Override
	public void m3() {
		logger.info("This is Overrided method of default m3() method in Class A");
	}
	
}

class B implements I{
	private static final Logger logger= Logger.getLogger(B.class.getName());
	public void m1(){
		logger.info("Class B m1() method");
	}
    public void m2() {
    	logger.info("Class B m2() method");
	}
    
    @Override
    public void m3() {
    	logger.info("This is Overrided method of default m3() method in Class B");
	}
}

class C implements I{
	private static final Logger logger= Logger.getLogger(C.class.getName());
	public void m1() {
		logger.info("Class C m1() method");
	}
	public void m2() {
		logger.info("Class C m2() method");
	}
	
	@Override
	public void m3() {
		logger.info("This is Overrided method of default m3() method in Class C");
	}
}

public class UseOfDefaultMethods {

	public static void main(String[] args) {
		A a = new A();
		a.m1();
		a.m2();
		a.m3();
		I.m4();
		
		B b = new B();
		b.m1();
		b.m2();
		b.m3();
		I.m4();
		
		C c= new C();
		c.m1();
		c.m2();
		c.m3();
		I.m4();
	}
}
