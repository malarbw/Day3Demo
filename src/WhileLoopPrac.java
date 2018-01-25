import java.util.Scanner;

public class WhileLoopPrac {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "y";
		
		while (cont.equalsIgnoreCase("y")) {
			//your code should start here
			
			System.out.println("Do some stuff");
			
			//this is where you code should end if you're using this as a template
			System.out.println("Do you want to continue? y/n: ");
			cont = scan.nextLine();
		}
		
		// Let the user know the program has ended
		System.out.println("Goodbye!");
		
		
		
		scan.close();
	}
}
