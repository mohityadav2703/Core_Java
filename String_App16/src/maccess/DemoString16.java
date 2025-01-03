package maccess;
public class DemoString16 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("language");
		System.out.println("Data In Sb :"+sb.toString());
		sb.insert(2,"NIT");
		System.out.println("********AFTER INSERT()*********");
		System.out.println("Data In Sb :"+sb.toString());
		sb.delete(2,5);
		System.out.println("********AFTER DELETE()*********");
		System.out.println("Data In Sb :"+sb.toString());
		sb.deleteCharAt(2);
		System.out.println("********AFTER DELETE_CHARAT()*********");
		System.out.println("Data In Sb :"+sb.toString());
		sb.reverse();
		System.out.println("********AFTER REVERSE********");
		System.out.println("Data In sb :"+sb.toString());
	      
	}
}
