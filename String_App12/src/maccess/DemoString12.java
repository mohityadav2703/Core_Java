package maccess;
public class DemoString12 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("default capacity :"+sb.capacity());
		System.out.println("Length of sb :"+sb.length());
		sb.append("Java");
		System.out.println("Data In Sb :"+sb.toString());
		System.out.println("Length of sb :"+sb.length());
		System.out.println("Capacity :"+sb.capacity());
		sb.append(" Programming");
		System.out.println("Data In Sb :"+sb.toString());
		System.out.println("Length of sb :"+sb.length());
		System.out.println("Capacity :"+sb.capacity());
		sb.append(" Language");
		System.out.println("Data in sb :"+sb.toString());
		System.out.println("Capacity :"+sb.capacity());
		System.out.println("Length of sb :"+sb.length());

	}

}
