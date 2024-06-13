package inheritance;

public class MultilevelC extends MultilevelB{
	public void displayC()
	{
		System.out.println("Display Class C");
	}

	public static void main(String[] args) {
		
		MultilevelC obj = new MultilevelC();
		obj.displayC();
		obj.displayA();
		obj.displayB();
		

	}

}
