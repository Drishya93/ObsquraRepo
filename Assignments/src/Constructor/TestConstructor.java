package Constructor;

public class TestConstructor {
	public TestConstructor()
	{
		//this("name");
		System.out.println("Parent Constructor");
	}

	
	public TestConstructor(String name)
	{
		this();
		System.out.println(name);
	}

}
