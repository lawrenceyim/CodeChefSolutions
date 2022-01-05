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
		        int boxA = input.nextInt();
		        int boxB = input.nextInt();
		        int boxC = input.nextInt();
		        int bagSize = input.nextInt();
		        if (bagSize >= boxA + boxB + boxC) System.out.println(1);
		        else if (bagSize >= boxA + boxB || bagSize >= boxA + boxC ||
		        bagSize >= boxB + boxC) System.out.println(2);
		        else System.out.println(3);
		    }
		}
        input.close();
	}
}
