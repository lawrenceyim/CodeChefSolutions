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
		        double grid = input.nextDouble();
		        int x = input.nextInt();
		        int y = input.nextInt();
		        int center = (int) Math.ceil(grid / 2);
                if (Math.abs(center - x) % 2 == 1 ^ Math.abs(center - y) % 2 == 1) {
                    System.out.println("1");
                } else System.out.println("0");
		    }
		}
        input.close();
	}
}
