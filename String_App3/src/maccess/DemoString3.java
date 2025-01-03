// Convert ASCII value to char

package maccess;
public class DemoString3 {

	public static void main(String[] args) {
		
		System.out.println("*********Upper Case Alphabet**********");
		for(int i=65;i<=90;i++)
		{
			char ch =(char)i;
			System.out.print(ch+" ");
		
		}
		System.out.println("\n*********Lower Case Alphabet***********");
		for(int i=97;i<=122;i++)
		{
			char ch=(char)i;
			System.out.print(ch+" ");
		}
		System.out.print("\n***********Numbers************\n");
		for(int i=48;i<=57;i++)
		{
			char ch=(char)i;
			System.out.print(ch+" ");
		}
		
	}

}
