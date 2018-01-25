import java.util.Scanner;

public class IfElsePractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age; 
		System.out.println("Please enter your age: ");
		age = scan.nextInt();
		
		if (age < 16) {
			System.out.println("You are " + age + " years old. You are not old enough to vote. Please do some research.");
		}
		else if ((age >= 16) && (age < 18)) {
			System.out.println("You are " + age + " years old. You are not yet old enough to vote. Go take a voter education class.");
		}
		else if (age >= 18) {
			System.out.println("You are " + age + " years old. You are legally allowed to vote!");
		}
		else {
			System.out.println("Do some research");
		}
		scan.close();

	}

}
