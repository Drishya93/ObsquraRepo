package aggregation;

public class ChildEx 
{
	int id;
	String rank;
	ParentEx add;
	
public ChildEx(int id, String rank, ParentEx add)
{
	this.id=id;
	this.rank=rank;
	this.add=add;
}

public void displayData()
{
	System.out.println(id);
	System.out.println(rank);
	System.out.println(add.name);
	System.out.println(add.age);
	
	
}
	public static void main(String[] args) {
		
		ParentEx obj = new ParentEx("Drishya",30);
		ChildEx obj2= new ChildEx(20,"First", obj);
		obj2.displayData();

	}

}
