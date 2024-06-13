package accessmodifiers;

public class AccessModifiers1 {

	public static void main(String[] args) {
		AccessModifiers obj1 = new AccessModifiers();
		obj1.display1();
		//obj1.display2(); Since it is private, this method cannot be called in another package
		obj1.display3();
		obj1.display4();
		

	}

}
