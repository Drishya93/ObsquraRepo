package Assignments;

public class ThisMeth
{
	String name;
	
	public void test()
	{
		this.testAgain("Drishya");
		System.out.println("Test1");
	}
	
	public void testAgain(String name)
	{
		this.name=name;
		System.out.println("Nmae is:" +name);
	}

	public static void main(String[] args) 
	{
		ThisMeth obj = new ThisMeth();
		obj.test();

	}

}
