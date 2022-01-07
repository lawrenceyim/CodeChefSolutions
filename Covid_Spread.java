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
	            int population = in.nextInt();
	            int days = in.nextInt();
	            int infected = 1;
	            for (int j = 0; j < days; j++) {
	               if (j < 10) {
	                   infected *= 2;
	                   if (infected > population) {
	                       infected = population;
	                       break;
	                   } 
	               } else {
	                   infected *= 3;
	               	   if (infected > population) {
	                       infected = population;
	                       break;
	                   } 
	               }
	            }
	            System.out.println(infected);
	        }
	    }
	    in.close();
	}
}
