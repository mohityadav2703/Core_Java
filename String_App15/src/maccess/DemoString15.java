package maccess;
public class DemoString15 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("LANGUAGE");
		System.out.println("Sb :"+sb.toString());
		System.out.println("Capacity :"+sb.capacity());
		System.out.println("Length :"+sb.length());
		//insert();
		sb.insert(2, "nit");
		System.out.println("Sb :"+sb.toString());
		System.out.println("Capacity :"+sb.capacity());	
		System.out.println("Length :"+sb.length());
		sb.insert(1,"mohit ");
		System.out.println("Sb :"+sb.toString());
		System.out.println("Capacity :"+sb.capacity());	
		System.out.println("Length :"+sb.length());
		//delete();
		sb.delete(1, 7);
		System.out.println("sb :"+sb.toString());
		sb.delete(2,5);
		System.out.println("sb :"+sb.toString());
		//reverse()
		sb.reverse();
		System.out.println("sb :"+sb.toString());
		sb.reverse();
		System.out.println("sb :"+sb.toString());
		//append()
		sb.append(" PROGRAMMING");
		System.out.println("sb :"+sb.toString());
		
	}

}
