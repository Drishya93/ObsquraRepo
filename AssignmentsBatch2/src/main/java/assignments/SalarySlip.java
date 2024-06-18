package assignments;

public class SalarySlip extends CalculateSalary{
	
	public void salaryDetails()
	{
		double total = basic + hra + pf;
		System.out.println("Total : " +total);
		System.out.println("Baic Pay : " +basic);
		System.out.println("Deduction : " +deduction);
		System.out.println("HRA : " +hra);
		System.out.println("PF : " +pf);
		System.out.println("Bonus : " +bonus);
	}

	public static void main(String[] args) {
		
		SalarySlip obj = new SalarySlip();
		
		
		obj.getInput();
		obj.calculation();
		obj.salaryDetails();

	}

}
