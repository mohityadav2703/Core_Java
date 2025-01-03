package test.pack1;

public sealed class ClassA permits ClassB,ClassC,ClassD{

	public void mA()
	{
		System.out.println("********MA()***********");
	}
}
