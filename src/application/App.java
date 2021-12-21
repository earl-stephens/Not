package application;

public class App {

	public static void main(String[] args) {
		// ! is the not operator
		// unary operator
		// flips boolean values

		// expression: something that evaluate to some value, such as 4 == 5
		System.out.println(!(4 == 5));

		int value1 = 4;
		int value2 = 3;

		if (value1 == value2) {

		} else
			System.out.println("Values are not equal.");
		
		// this is the same as above
		if(!(value1 == value2)) {
			System.out.println("Values are not equal.");
		}
		
		/* == is a binary operator, requires two variables
		 * ! is a unary operator, only requires one boolean
		 */
	}

}
