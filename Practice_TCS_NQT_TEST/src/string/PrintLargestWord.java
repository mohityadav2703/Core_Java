package string;

public class PrintLargestWord {
	public static void main(String[] args) {
		String str="Hello my name is MohitKumar";
		String[] words = str.split(" ");
		String ab ="";
		int size=0;
		for(int i=0;i<words.length;i++) {
				int len=words[i].length();
				if(size<len) {
					size=len;
					ab=words[i];
				}
			
			}
		System.out.println("Largest String is :"+ab+ " Having Size :"+size);
		}

}
