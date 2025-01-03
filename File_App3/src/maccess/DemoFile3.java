package maccess;
import java.io.*;
public class DemoFile3 {
	public static void main(String[] args) {
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			File f=new File("D:\\soft\\Text.txt");
			FileWriter fw=new FileWriter(f);
			System.out.println("Enter The Data(@ at end :)");
			char ch;
			while((ch=(char)br.read())!='@')
			{
				fw.write(ch);
			}//end of loop
			System.out.println("Data Stored to file Successfully...");
			fw.close();
			br.close();
			System.out.println("*****Data From The File*****");
			FileReader fr=new FileReader(f);
			int k;
			while((k=fr.read())!=-1)
			{
				System.out.print((char)k);
			}
			fr.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
