package Constructor;

public class ThisKey
{


public  ThisKey (int a , int b)
{
	this();
	int c = a+b;
	System.out.println("The sum is :" +c);;
}
public ThisKey()
{
	//this(1,1);
	System.out.println("Test");
}
	public static void main(String[] args)
	{
		ThisKey obj = new ThisKey(1,2);

	}

}

