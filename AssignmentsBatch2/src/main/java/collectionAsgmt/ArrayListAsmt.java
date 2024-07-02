package collectionAsgmt;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAsmt {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		{
		
			arr.add("Red");
			arr.add("Yellow");
			arr.add("Green");
			arr.add("Blue");
			arr.add("Violet");
		System.out.println(arr);
		
		System.out.println(arr.get(0));
		arr.remove(2);
		System.out.println(arr);
		boolean b = arr.isEmpty();
		System.out.println(b);
		
		boolean a = arr.contains("Red");
		System.out.println(a);
		
		Iterator<String> it = arr.iterator();
		
		{
			System.out.println(it);
		}
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
				

}
}
}