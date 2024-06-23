package AbstractInterfaceAssmt;

public class HDFC implements RBI{
	int n;
	
	int amount;
	int cash;
	int interest;
	
	public void depositAmount(int amount, int n, int interest)
	{
		cash = n * amount + interest ;
		System.out.println("Withdrawal amount is : " +cash);
	}

	public static void main(String[] args) {
		HDFC obj = new HDFC();
		
		obj.recurringDeposit(12, 100, 1500);
		obj.depositAmount(12, 100, 1500);

	}

	@Override
	public void recurringDeposit(int amount, int n, int interest) {
		System.out.println("Amount deposited is : " +amount);
		System.out.println("Duration is : " +n);
		System.out.println("Interest amount is : " +interest);
		
	}

}
