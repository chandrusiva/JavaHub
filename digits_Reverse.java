
/* This program extracts digits from a number and prints them in
 * reverse order with a comma separating the digits. This program
 * uses Scanner class to obtain user input.
 */
 
import java.util.*;
import java.lang.*;
import java.io.*;


public class digits_Reverse
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int temp;
		System.out.println("Entered number is "+number+"\n");
		System.out.print("The digits in reverse are ");
		while(number!=0)
		{
				temp = number % 10;
				System.out.print(temp+", ");
				number = number/10;
		}	
	}
}
