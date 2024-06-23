package aggregationAssmt;

public class PrintDetails {
	
	String addressline1;
	String addressline2;
	Student add;
	
	public PrintDetails(String addressline1, String addressline2,Student add)
	{
		System.out.println(add.name);
		System.out.println(add.num);
		System.out.println(addressline1);
		System.out.println(addressline1);
	}

	public static void main(String[] args) {
		Student obj1 = new Student("Drishya", 20);
		PrintDetails obj2 = new PrintDetails("add1", "add2",obj1);
		
		

	}

}
