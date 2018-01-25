
public class DoWhileExample {

	public static void main(String[] args) {
		
		int i = 1;
		int month = 36;
		double futureValue = 0;
		double monthlyPmt = 330.63;
		double intRate = 5.99/100;
		
		do {
			futureValue = (futureValue + monthlyPmt) * (1 + intRate);
			i++;
			
		} while (1 <= month);
		
		System.out.println(futureValue);
		
		//any code down here is not associated with the do{}while loop
	}

}
