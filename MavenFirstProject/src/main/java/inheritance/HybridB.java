package inheritance;

public class HybridB extends HybridA{
	public void displayB()
	{
		System.out.println("Class B");
	}

	public static void main(String[] args) {
		HybridB obj = new HybridB();
		obj.displayB();
		obj.displayA();
		

	}

}
