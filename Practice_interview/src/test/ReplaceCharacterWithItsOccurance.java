package test;

import java.util.LinkedHashMap;
import java.util.Map;

public class ReplaceCharacterWithItsOccurance {
	public static void main(String[] args) {
		
		String str="committttttttee";
		char ch='t';
		
		char chars[]=str.toCharArray();
		int cnt=1;
		for(int i=0;i<chars.length;i++) {
			if(chars[i]==ch) {
				chars[i]=String.valueOf(cnt).charAt(0);
				cnt++;
			}
		}
		System.out.println(chars);
	}
}
