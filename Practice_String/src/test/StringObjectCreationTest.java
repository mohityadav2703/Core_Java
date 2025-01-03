package test;

public class StringObjectCreationTest {
	public static void main(String[] args) {
		String s1="ABC";		// object created directly in 'string constant pool'
		String s2="ABC";
		String s3="ABC";
		String s7="XYZ";
		String s4=new String("ABC"); //object created in heap area
		String s5=new String("ABC");
		String s6=new String("ABC");
		String s8=new String("MNP");
		System.out.println(s1+" ->"+s1.hashCode());
		System.out.println(s2+" ->"+s2.hashCode());
		System.out.println(s3+" ->"+s3.hashCode());
		System.out.println(s4+" ->"+s4.hashCode());
		System.out.println(s5+" ->"+s5.hashCode());
		System.out.println(s6+" ->"+s6.hashCode());
		System.out.println(s7+" ->"+s7.hashCode());
		System.out.println(s8+" ->"+s8.hashCode());
		
	}

}
