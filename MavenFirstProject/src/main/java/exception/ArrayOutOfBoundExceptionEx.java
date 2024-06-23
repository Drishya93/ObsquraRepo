package exception;

public class ArrayOutOfBoundExceptionEx {

	public static void main(String[] args) {
		int arr[] = new int [3];
		
		try
		{
		 arr[5] = 2;
		}
		catch (ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Exception Occured");
		}
		

	}

}
