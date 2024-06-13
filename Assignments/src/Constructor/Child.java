package Constructor;

public class Child extends TestName
{
	
	public Child()
	{
		super("Super");
		System.out.println("Child Constructor");
	}
public Child(String test)
{
	this();
	System.out.println(test);
}
	public static void main(String[] args) {
		//Child obj = new Child("Test");
		Child obj = new Child();

	}

}
