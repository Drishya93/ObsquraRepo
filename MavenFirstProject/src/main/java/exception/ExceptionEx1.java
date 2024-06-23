package exception;

public class ExceptionEx1 {
	 
	

	public static void main(String[] args) {
		int a=1;
		 int b=0;
		try {
		int c = a/b;
		System.out.println(c);
	}
 catch(ArithmeticException f)
		{
	System.out.println("Exception Occured " +f);
		} 
		
		finally
		{
			System.out.println("Thank you");
		}
}
}
