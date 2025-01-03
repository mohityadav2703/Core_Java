package maccess;
public class DemoString14 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("nit-patna-java");
		StringBuffer sb2 = new StringBuffer(sb1);
		System.out.println("Sb1 :"+sb1.toString());
		System.out.println("Sb2 :"+sb2.toString());
		System.out.println("Capacity of sb2:"+sb2.capacity());
		System.out.println("Length of sb2 :"+sb2.length());
		sb2.append(" JAVA PROGRAMMING LANGUAGE IS BEST FOR SECURITY");
		System.out.println("Sb2 :"+sb2.toString());
		System.out.println("Capacity of sb2:"+sb2.capacity());
		System.out.println("Length of sb2 :"+sb2.length());

	}

}
