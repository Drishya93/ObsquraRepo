package assignments;

public class FactorialNumber {
	int num;
	int i;
	long factorial;
	public void findFactorial(int num)
	{
		 
		this.num = num;
		if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }

         factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;              
	}
        this.printFactorial();
	}
	
	public void printFactorial()
	{
		System.out.println("The Factorial of entered number is :" +factorial);
	}

	public static void main(String[] args) {
		
		FactorialNumber obj = new FactorialNumber();
		obj.findFactorial(3);

	}

}
