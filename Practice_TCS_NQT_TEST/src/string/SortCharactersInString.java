package string;

public class SortCharactersInString {
	public static void main(String[] args) {
		String str="common";
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i] > ch[j]) {
					int temp=ch[i];
					ch[i]=ch[j];
					ch[j]=(char)temp;
				}
			}
		}
		System.out.print(ch);

		
	}

}
