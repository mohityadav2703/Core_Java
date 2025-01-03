package maccess;

public class DemoString_App1 {

	public static void main(String[] args) {
		//using string literal process
		String str="NIT";
		//using new operator process
		String str1=new String("JAVA");
		int len=str.length();
		int len1=str1.length();
		System.out.println("=========Literal String=========");
		System.out.println("String-1 :"+str.toString());
		System.out.println("Index-1:"+str.charAt(0));
		System.out.println("Index-2:"+str.charAt(1));
		System.out.println("Index-3:"+str.charAt(2));
		System.out.println("Length :"+len);
		System.out.println("=========Literal String=========");
		System.out.println("String-2 :"+str1);
		System.out.println("Index-1:"+str1.charAt(0));
		System.out.println("Index-2:"+str1.charAt(1));
		System.out.println("Index-3:"+str1.charAt(2));
		System.out.println("Length :"+len1);

	}
}
