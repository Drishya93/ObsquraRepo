package Constructor;

public class ThisReference 
{
	String name;
	int age;
	public ThisReference(String name , int age)
	{
		this.age=age;
		this.name=name;
	}
	
	public  void displayData()
	{
		System.out.println("Name is: "+ name);
		System.out.println("Age is: "+ age);
	}

	public static void main(String[] args)
	{
		ThisReference disp = new ThisReference("Drishya" , 30);
		disp.displayData();

	}

}
