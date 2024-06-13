package package1;

public class PrintDetails 
{
	
public static void display1(int id)
{
	System.out.println(id);
	
}
public static String display2(String name)
{
	return name;
}
public static int display3(int age)
{
	return age;
}
	public static void main(String[] args) 
	{
		PrintDetails.display1(15);
		System.out.println(PrintDetails.display2("Drishya"));
		System.out.println(PrintDetails.display3(30));
	}

}
