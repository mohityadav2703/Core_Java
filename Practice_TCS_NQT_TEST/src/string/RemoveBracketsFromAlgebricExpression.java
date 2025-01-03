package string;

public class RemoveBracketsFromAlgebricExpression {
	public static void main(String[] args) {
		String str="(a+b)-c*d(k*(l-n))";
		String afterRemoveBrackets="";
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch!='(' && ch!=')') {
				afterRemoveBrackets=afterRemoveBrackets+ch;
			}
		}
		System.out.println(afterRemoveBrackets);
	}

}
