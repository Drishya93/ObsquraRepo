package assignments;

import java.util.Scanner;

public class SalaryInput {
	int basic;
	int deduction;
	int bonus;
	public void getInput()
	{
	
	Scanner scanner = new Scanner(System.in) ;
	System.out.println("Enter Basic: ");

	
	 basic = scanner.nextInt();
	System.out.println("Enter Deduction: ");

	 deduction = scanner.nextInt();
	System.out.println("Enter Bonus: ");

	
	 bonus = scanner.nextInt();
	 scanner.close();

}
	
	
}
