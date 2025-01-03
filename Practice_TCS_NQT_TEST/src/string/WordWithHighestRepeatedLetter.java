package string;

import java.util.Scanner;

public class WordWithHighestRepeatedLetter {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Enter any sentence or word combination: ");
		    String myString = sc.nextLine();
		    String result = "";
		    int count = 0;
		    
		    String[] words = myString.split("\\s+");
		    for(int i = 0; i < words.length; i++) {
		        for(int j = 0; j < words[i].length(); j++) {
		        
		        	for(int k = 1; k < words[i].length(); k++) {
		                char temp = words[i].charAt(k);
		                if(temp == words[i].charAt(k-1)) {
		                    count++;
		                    result=words[i];
		                }
		            }
		        }
		        
		    }
		    System.out.println(result);
	sc.close();
  }
}
