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
	            int solids = input.nextInt();
	            int liquids = input.nextInt();
	            if (liquids == 0 && solids > 0) System.out.println("Solid");
	            else if (liquids > 0 && solids == 0) System.out.println("Liquid");
	            else if (liquids > 0 && solids > 0) System.out.println("Solution");
	        }
	    }
	    input.close();
	}
}
