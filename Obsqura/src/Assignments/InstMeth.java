package Assignments;

public class InstMeth 
{
	static int a=1;
	static int b=2;
	static int c;
	public int displayMeth()
	{
		
c = a + b;
return c;
	}
	public static void main(String[] args) 
	{
		
		InstMeth obj = new InstMeth();
		System.out.println("The sum is :" + obj.displayMeth());
	}

}
