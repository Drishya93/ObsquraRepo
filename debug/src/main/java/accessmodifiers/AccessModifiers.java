package accessmodifiers;

public class AccessModifiers 
{
	public void display1()
	{
		System.out.println("Public Method");
	}
	private void display2()
	{
		System.out.println("Private Method");
	}
	protected void display3()
	{
		System.out.println("Protected Method");
	}
	void display4()
	{
		System.out.println("Default Method");
	}

	public static void main(String[] args) 
	{
		AccessModifiers obj = new AccessModifiers();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();

	}

}
