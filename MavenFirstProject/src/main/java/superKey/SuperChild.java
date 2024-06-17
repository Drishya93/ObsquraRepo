package superKey;

public class SuperChild extends SuperEx1{
	
	String name = "Child";
	
	public void display()
	{
		System.out.println("Parent Name is :" +super.name);
		System.out.println("Child Name is :" +name);
	}

	public static void main(String[] args) {
		
		SuperChild obj = new SuperChild();
		obj.display();
		

	}

}
