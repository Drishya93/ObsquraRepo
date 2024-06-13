package Constructor;

public class DefConstrctr {
	public DefConstrctr()
	{
		System.out.println("name");
	}
	public DefConstrctr(String a, String b)
	{
		String name =  a +  b;
		System.out.println(name);
	}
	public static void main(String[] args)
	{
		DefConstrctr obj1 = new DefConstrctr();
		DefConstrctr obj2 = new DefConstrctr("Drishya ","Sreekumar");
		
	}

}
