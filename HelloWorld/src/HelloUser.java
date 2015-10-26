import java.util.Scanner;

public class HelloUser {
	
	public static String greetMe (){
		Scanner userInput= new Scanner(System.in);
		System.out.println("Please enter your name:");
		String userName = userInput.nextLine();
		return userName;
	}
}