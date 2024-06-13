package inheritance;

public class HybridC extends HybridA {
	public void displayC()
	{
		System.out.println("Class C");
	}

	public static void main(String[] args) {
		
		HybridC obj = new HybridC();
		obj.displayC();
		obj.displayA();

	}

}
