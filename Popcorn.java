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
		    int tests = in.nextInt();
		    for (int i = 0; i < tests; i++) {
		        int a = in.nextInt() + in.nextInt();
		        int b = in.nextInt() + in.nextInt();
		        int c = in.nextInt() + in.nextInt();
		        System.out.println(Math.max(Math.max(a, b), c));
		    }
		}
		in.close();
	}
}
