
public class ForLoopPrac {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println(i + " = Fizz Buzz");
			}
			else if (i % 5 == 0) {
				System.out.println(i + " = Buzz");
			}
			else if (i % 3 == 0) {
				System.out.println(i + " = Fizz");
			}
			else {
				System.out.println(i + " = No Fizz or Buzz");
			}
			//often used in job interviews, good to understand the logic
		}

	}

}
