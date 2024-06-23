
package polymorphismAssmt;


public class OnSeason {
	
	public void discount(double price)
	{
		
		
		double discount = price * 0.40;
		
		double lastamount = price - discount;
		System.out.println("Mrp is : " +price);
		System.out.println("Final Price Onseason is : " +lastamount);
		
		
	}

}
