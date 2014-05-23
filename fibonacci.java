
/* This java program computes Fibonacci series terms for a given index. It uses Buffered Reader
 * to get the index input from the user */

import java.io.*;

public class fib {
	
	
	int firstnum=0;
	int secondnum=1;
	
	/* This is the main method. The input is got from the user and an object is created */
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter index (Number of terms):");
		int index=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		index = Integer.parseInt(br.readLine());
		System.out.println("Entered index is " + index);
		System.out.println("**Fibonacci sequence**");
		fib obj = new fib();
		obj.compute(index);
	}
	
	public void compute(int i) {

		/* Dont compute Fibonacci series terms if the index is 0 */
		if(i==0)
		{
			return;
		}
		
		if(i==1)
		{
			System.out.println(firstnum);
			return;
		}
		
		System.out.println(firstnum);
		System.out.println(secondnum);
		
		/* Since the first two terms are already available, compute for (index-2) terms */
		
		while(i>2)
		{
			int thirdnum = firstnum + secondnum;
			System.out.println(thirdnum);
			firstnum = secondnum;
			secondnum = thirdnum;
			i--;
		}
	}
	
}
