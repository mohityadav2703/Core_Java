package maccess;
public class DemoString13 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("nit-hyd");
		System.out.println("Sb :"+sb.toString());
		System.out.println("Capacity of sb :"+sb.capacity());
		System.out.println("Length of sb :"+sb.length());
		sb.append("Nit-patna");
		System.out.println("Capacity of sb :"+sb.capacity());
		System.out.println("Length of sb :"+sb.length());
		sb.append(" JAVA PROGRAMMING LANGUAGE");
		System.out.println("Capacity of sb :"+sb.capacity());
		System.out.println("Length of sb :"+sb.length());
		
		
		
	}

}
