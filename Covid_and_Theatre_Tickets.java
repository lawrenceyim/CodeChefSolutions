/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner(System.in);
	    if (input.hasNext()) {
	        int testcases = input.nextInt();
	        for (int i = 0; i < testcases; i++) {
	            double rows = input.nextDouble();
	            double seats = input.nextDouble();
	            int tickets = (int) (Math.ceil(rows / 2) * Math.ceil(seats / 2));
	            System.out.println(tickets);
	        }
	    }
        input.close();
	}
}
