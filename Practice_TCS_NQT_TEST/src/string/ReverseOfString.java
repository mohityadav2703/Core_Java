package string;

public class ReverseOfString {
	public static void main(String[] args) {
		String str="Hello this is java";
		String[] str1=str.split(" ");
		
		for(String abc : str1) {
			StringBuffer sb = new StringBuffer(abc);
			System.out.print(sb.reverse()+" ");
		}
		
	}

}
