package maccess;
import java.io.*;
import java.util.*;
public class DemoFile2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			try
			{
				System.out.println("Enter FilePath & FileName(source):");
				File f=new File(s.nextLine());
				if(f.exists())
				{
					FileInputStream fis=new FileInputStream(f);
					System.out.println("Enter The FilePath & FileName(destination):");
					File f2=new File(s.nextLine());
					FileOutputStream fos=new FileOutputStream(f2);
					int k;
					while((k=fis.read())!=-1)
					{
						fos.write(k);
					}//end of loop
					System.out.println("File Copied Successfully....");
					fos.close();
					fis.close();
				}
				else
				{
					System.err.println("Invalid File Path or Name...");
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}//end of try with resource

	}

}
