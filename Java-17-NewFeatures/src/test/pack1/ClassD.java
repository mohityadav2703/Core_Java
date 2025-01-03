package test.pack1;

public sealed class ClassD extends ClassA permits ClassE{
	public void mD()
	{
		System.out.println("********MD()*********");
	}

}
