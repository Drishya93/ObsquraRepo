package Assignments;

public class MethOverLoad 
{


public double add(double a, double b)
{
	double c = a+b;
	return c;
}
public int add(int e, int f)
{
	int d = e+f;
	return d;
}

	public static void main(String[] args) 
	{
		MethOverLoad obj = new MethOverLoad();
		
		System.out.println("The sum is:" +obj.add(1.1,2.1));
		System.out.println("The sum is:" +obj.add(1,2));
		

	}

}
