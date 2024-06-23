package abstraction;

public class AbstractClassChild extends AbstractClassEx1{

	public static void main(String[] args) {
		
		AbstractClassChild obj = new AbstractClassChild();
		obj.display1();
		obj.display2();
		

	}

	@Override
	public void display2() {
		System.out.println("Sreekumar");
		
	}

}
