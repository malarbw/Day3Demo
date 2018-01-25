
public class JavaBasics {

	public static void main(String[] args) {
		final String TEST = "hello";
		// TEST = "no"; we cannot do this - the constant cannot be reassigned
		System.out.println(TEST);
		
		// primitive type declarations
		byte b = 127; //byte, short, int, and long are all used for numbers but they capture different ranges. goes from smallest range to largest
		short s = 32767;
		int i = 13333;
		float fl = 6.7f; //the f after the number tells the IDE that you're using a float
		double d = 5.6667;
		char c = 'c';
		boolean bool = true; //defaults to false unless you declare it
		long l = 1237848294982L; //the l (case doesn't matter) after the number tells IDE you're using a long
		
		//implicit conversion examples
		int numOfItems = 5;
		System.out.println(3.0/1.5);
		System.out.println(3.0/2);
		System.out.println((numOfItems + 10) / 2);
		System.out.println((numOfItems + 10) / 2.0);
		
		//explicit casting (type casting)
		double x = (double) (3/5);
		System.out.println(x);
		double y = (double) 3 / (double) 5;
		System.out.println(y);
		
		//example -- common error forgetting to cast
		int kidsInFamily1 = 3;
		int kidsInFamily2 = 4;
		int numOfFamilies = 2;
		
		double avgKidsPerFamily = (double) (kidsInFamily1 + kidsInFamily2) / (double) numOfFamilies;
		System.out.println(avgKidsPerFamily);
		
		
		
		
		
		

	}

}
