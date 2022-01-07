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
		    int testcases = in.nextInt();
		    for (int i = 0; i < testcases; i++) {
		        double T1 = in.nextDouble();
		        double T2 = in.nextDouble();
		        double R1 = in.nextDouble();
		        double R2 = in.nextDouble();
		        double TRatio = Math.pow((T1 / T2), 2);
		        double RRatio = Math.pow((R1 / R2), 3);
		        if (TRatio == RRatio) System.out.println("YES");
		        else System.out.println("NO");
		    }
		}
		in.close();
	}
}
