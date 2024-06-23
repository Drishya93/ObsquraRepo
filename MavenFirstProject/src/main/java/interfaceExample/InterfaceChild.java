package interfaceExample;

public class InterfaceChild implements InterfaceParent{
	
	int a=1;
	int b=2;
	

	public static void main(String[] args) {
		InterfaceChild obj = new InterfaceChild();
		obj.display1();
		obj.display2();

	}

	@Override
	public void display1() {
	System.out.println("Drishya");
		
	}

	@Override
	public void display2() {
		int c = a + b;

System.out.println(c);
		
	}

}
