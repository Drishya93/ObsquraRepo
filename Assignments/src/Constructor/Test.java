package Constructor;

import java.util.Scanner;

public class Test 
{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
System.out.println("Enter the number: ");
int num = scanner.nextInt();

System.out.println("Enter the word: ");
String word = scanner.next();

System.out.println("Enter the word: " +word);
System.out.println("Enter the Character: " );
char name = scanner.next().charAt(0);
System.out.println("Enter the ch: " + name);



scanner.close();
	}

}
