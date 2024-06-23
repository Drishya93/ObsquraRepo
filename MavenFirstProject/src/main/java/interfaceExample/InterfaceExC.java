package interfaceExample;

public class InterfaceExC implements InterfaceExA,InterfaceExB 
{
	
	public void display3()
	{
		System.out.println("C");
	}

	public static void main(String[] args) {
		
		InterfaceExC obj = new InterfaceExC();
		obj.display1();
		obj.display2();
		obj.display3();
		

	}

	@Override
	public void display2() {
		System.out.println("B");
		
	}

	@Override
	public void display1() {
		System.out.println("A");
		
	}

}
