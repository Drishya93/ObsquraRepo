package exception;

public class ThrowVotingEx {
	

	public static void main(String[] args) {
		
		int age = 5;
		
		if(age>=18)
		{
			System.out.println("Eligible");
		}
		else 
		{
			throw new ArithmeticException("Invalid Age");
		}
		

	}

}
