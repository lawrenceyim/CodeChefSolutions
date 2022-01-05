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
		    int testcase = input.nextInt();
		    for (int i = 0; i < testcase; i++) {
		        int ones = input.nextInt();
		        int twos = input.nextInt();
		        if (twos % 2 == 0 && ones % 2 == 0) {
		            System.out.println("YES");
		        } else if (twos % 2 == 1 && ones >= 2 && ones % 2 == 0) {
		            System.out.println("YES");
		        } else {
		            System.out.println("NO");
		        }
		    }
		}
        input.close();
	}
}
