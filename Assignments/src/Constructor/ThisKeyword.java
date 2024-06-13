package Constructor;

public class ThisKeyword
{
public void printFirst()
{
	this.printSecond();
	System.out.println("Display1");
}
public void printSecond()
{
	System.out.println("Display2");
}
	public static void main(String[] args) 
	{
		ThisKeyword obj = new ThisKeyword();
		obj.printFirst();

	}

}
