// String concatnation means Adding Strings

package maccess;

public class DemoStringConcatnation {

	public static void main(String[] args) {
		String s1="JAVA";
		String s2="PROGRAMMING";
		String s3="LANGUAGE";
		String s4=s1+" "+s2+" "+s3;
		System.out.println(s4);
		String s5=(s1.concat(" "+s4));
		System.out.println(s5);
		System.out.println(s1.concat(" "+s3));
		System.out.println(s1.concat(" "+s3).concat(" "+s2));
		System.out.println(s3.concat(" "+s2).concat(" "+s1));

	}

}
