package assignments;

public class CalculateSalary extends SalaryInput{
	
	protected double hra;
	protected double pf;
	
	public void calculation()
	{
		
		
		 hra = (basic*5)/100.0;
		 pf = (basic*20)/100.0;
	}

}
