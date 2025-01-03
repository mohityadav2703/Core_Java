package p2;
import p1.*;
public class DemoThreading4 {

	public static void main(String[] args) {
		//anonymous object of Thread
		new Thread(Register :: reg).start();
		new Thread(Login :: log).start();

	}

}
