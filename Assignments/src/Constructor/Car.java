package Constructor;

public class Car 
{
	
private String name ;
private String model ;
private int year ;

public Car(String name, String model, int year)
{
	this.name = name;
	this.model = model;
	this.year = year;
	
}
public String displayName()
{
	return name;
}
public String displayModel()
{
	return model;
}
public int displayYear()
{
	return year;
}

	public static void main(String[] args)
	{
		//Car name1 = new Car("Maruti");
		//Car model1 = new Car("Brezza");
		//Car year1 = new Car(2019);
		Car obj = new Car("Maruti","Brezza",2018);
		Car obj1 = new Car("Ford","EcoSport",2019);
		
		System.out.println("Car name is: " +obj.displayName());
		System.out.println("Car model is: " +obj.displayModel());
		System.out.println("Car year is: " +obj.displayYear());
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("Car name is: " +obj1.displayName());
		System.out.println("Car model is: " +obj1.displayModel());
		System.out.println("Car year is: " +obj1.displayYear());
	}

}
