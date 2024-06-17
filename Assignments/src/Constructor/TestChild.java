package Constructor;

public class TestChild extends TestConstructor {

	
		
		public TestChild()
		{
			this("Child");
			System.out.println("Child Constructor");
		}
	public TestChild(String test)
	{
		super("test");
		System.out.println(test);
	}
		public static void main(String[] args) {
			//Child obj = new Child("Test");
			TestChilds obj = new TestChild();

		}
	}

