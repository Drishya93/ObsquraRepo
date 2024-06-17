package polymorphism;

public class ChildPoly extends ParentPoly {
	
	public void displayParent()
	{
		System.out.println("Child");
		super.displayParent("Drishya");
	}

	public static void main(String[] args) {
		ChildPoly obj = new ChildPoly();
		obj.displayParent();

	}

}
