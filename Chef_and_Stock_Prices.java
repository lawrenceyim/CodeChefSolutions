/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		if (in.hasNext()) {
		    int testcase = in.nextInt();
		    for (int i = 0; i < testcase; i++) {
		        double price = in.nextDouble();
		        double min = in.nextDouble();
		        double max = in.nextDouble();
		        double change = in.nextDouble();
		        if (change > 0) {
		            price *= (change / 100) + 1;
		        } else {
		            price -= price * Math.abs(change / 100);
		        }
		        if (price >= min && price <= max) {
		            System.out.println("YES");
		        } else {
		            System.out.println("NO");
		        }
		    }
		}
        in.close();
	}
}


