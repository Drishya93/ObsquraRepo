package Assignments;



public class Person {
	String name;
	int id;
	String place;
	static String Company = "Obsqura";
	
	public  Person(String name, int id, String place)
	{
		this.name = name;
		this.place = place;
		this.id = id;
	}
	
	public  void displayData()
	{
		
		System.out.println("Name is :" +name);
		System.out.println("Place is :" +place);
		System.out.println("Id is :" +id);
		System.out.println("Company is :" +Company);
		System.out.println();
	}

	public static void main(String[] args) 
	{
		Person obj1 = new Person("Drishya", 1 ,"Trivandrum");
		Person obj2 = new Person("Anisha",2,"Banglore");
		Person obj3 = new Person("Anupama",3,"Kollam");
		Person obj4 = new Person("Pooja",4,"Kottayam");
		Person obj5 = new Person("Athira",5,"Kannur");
		//Person.Company = "Obsqura";
		obj1.displayData();
		obj2.displayData();
		obj3.displayData();
		obj4.displayData();
		obj5.displayData();
		

	}

}
