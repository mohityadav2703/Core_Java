package string;

public class FindPositionOfSubstringWithinString {
	public static void main(String[] args) {
		String str="takeforward";
		String str1="forward";
		
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(str1.charAt(0) == ch[i]) {
				System.out.println(str1+" is present at index "+i+" position at string "+str);
			}
		}
	}
}
