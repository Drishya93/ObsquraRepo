package exception;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {
    String age = "Drish30";
     try 
     {
        
        int num = Integer.parseInt(age);
        System.out.println("Age is: " + num);
        
     }
     catch(NumberFormatException a)
     {
    	 System.out.println("Exception Occured");
     }
       
     finally
     {
    	 System.out.println("Finally Statement");
     }

	}

}
