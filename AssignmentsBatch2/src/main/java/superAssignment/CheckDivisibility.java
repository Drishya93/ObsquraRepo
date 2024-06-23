package superAssignment;

public class CheckDivisibility extends Addition {
	int d;
	
	
	public void divisibleCheck()
	{
		super.addNumbers(5, 5);
		System.out.println("The Sum is :" +super.c);
		d = super.c;
		
		if (d % 10 == 0)
		{
			System.out.println("Added value is divisible by 10");
		}
		else
		{
			System.out.println("Added value is not divisible by 10");
		}
	}

	public static void main(String[] args) {
		
		CheckDivisibility obj = new CheckDivisibility();
		obj.divisibleCheck();
		

	}

}
