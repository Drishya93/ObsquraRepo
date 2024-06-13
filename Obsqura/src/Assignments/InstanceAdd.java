package Assignments;

public class InstanceAdd {
	int a;
	int b;
	int c;
	int e;
	
	public InstanceAdd(int a , int b) 
	{
		this.a=a;
		this.b=b;
		
	}
	public int addInstance() {
		c=a+b;
		return c;
	}
	public int multiplyInstance() 
	{
		e = a*b;
		return e;
	}

	public static void main(String[] args)
	{
		
		InstanceAdd obj = new InstanceAdd(1,2);
		System.out.println("The sum is: " +obj.addInstance());
		System.out.println("The multiplied value is :" +obj.multiplyInstance());
	}

}
