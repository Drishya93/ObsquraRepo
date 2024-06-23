package AbstractInterfaceAssmt;

public class Contractor extends Employee {
	
	int hr;
	int payment;
	int salary;
	int sal;
	
	
	public void calculateContractorSalary(int hr, int payment)
	{
		salary = payment * hr;
		System.out.println("Contractor Salary is : " +salary);
	}

	public static void main(String[] args) {
		Contractor obj = new Contractor();
		obj.calculateContractorSalary(5, 100);
		obj.calculateSalary(500);

	}

	@Override
	public void calculateSalary(int payment) {
		sal = 8 * payment;
		System.out.println("FTE Salary is : " +sal);
		
	}

	
}
