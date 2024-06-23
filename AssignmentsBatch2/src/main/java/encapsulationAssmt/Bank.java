package encapsulationAssmt;

public class Bank {
	
	private int pin;
	
	public void getPin()
	{
		System.out.println("The pin num is : " +pin);
	}
	
	public void setPin(int pin)
	{
		this.pin=pin;
		
		if(pin == 1001 || pin == 1234 || pin == 1212)
		{
			System.out.println("Valid pin");
		}
		else
		{
			System.out.println("Invalid pin");
		}
	}

}
