package maccess;
import java.io.*;
import test.Register;
public class DemoFile5 {
	public static void main(String[] args) {
		try
		{
			File f = new File("D:\\soft\\Object.txt");
			FileInputStream fis=new FileInputStream(f);
			ObjectInputStream ois=new ObjectInputStream(fis);
			Register ob=(Register)ois.readObject();//Deserialization
			System.out.println("*****User-Details*****");
			System.out.println(ob.Display());
			ois.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
