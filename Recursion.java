import java.util.Scanner;

/* This program prints the factorial of a number. Java's recursion
 * attribute is used here which allows a method to call itself. 
 * This program uses Scanner class to get integer input from user.
 */


class Recursion_stub {
			int compute_factorial(int number) {
				int fact;
				if(number==1)
					return 1;
				fact = number * compute_factorial(number-1);
				return fact;
				}
}
public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int factorial=1;
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		if(number!=0) {
			Recursion_stub ob = new Recursion_stub();
			factorial = ob.compute_factorial(number);
		}
		System.out.println("The factorial of "+ number + " is " + factorial);
	}

}
