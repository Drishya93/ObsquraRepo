package Constructor;

public class Add 
{
	static int a ;
	static int b;
	static int c;
	
	public static int add(int num1 , int num2)
	{
		a=num1;
		b=num2;
		 c = num1 + num2;
		return c;
		
	}
	public static void avg()
	{
		float d = c/2f;
		System.out.println("Avg is : " + d);
		
	}
	

	public static void main(String[] args) {
		
		
		System.out.println("Sum is: " +Add.add(1,2));
		
		Add.avg();
		
		

	}
	
	

}
