package test;

import java.util.logging.Logger;

interface Inter{
	static final Logger logger = Logger.getLogger(Inter.class.getName());
	public static void m1() {
		logger.info("This is Interface Static method");
	}
}

public class UseOfStaticMethod implements Inter{
	public static void main(String[] args) {
		Inter.m1();
	}

}
