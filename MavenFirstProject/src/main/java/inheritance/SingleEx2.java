package inheritance;

public class SingleEx2 extends SingleEx1 {
	public void print()
	{
		System.out.println("Display Child");
	}

	public static void main(String[] args) {
		
		SingleEx2 obj = new SingleEx2();
		obj.display1();
		obj.print();

	}

}
