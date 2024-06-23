package polymorphismAssmt;


public class OffSeason extends OnSeason {
	
	public void discount(double price1)
	{
		super.discount(150.0);
		
		
		double discount1 = price1 * 0.15;
		double lastprice = price1 - discount1;
		
		System.out.println("MRP is : " +price1);
		System.out.println("Final Price OffSeason is : " +lastprice);
		
	}
	

	public static void main(String[] args) {
		
		OffSeason obj = new OffSeason();
		obj.discount(150.0);

	}

}
