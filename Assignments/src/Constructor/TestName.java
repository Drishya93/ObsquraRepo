package Constructor;

public class TestName {
	public TestName()
	{
		System.out.println("Parent Constructor");
	}

	
	public TestName(String name)
	{
		this();
		System.out.println(name);
	}

}
