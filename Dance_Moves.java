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
		        int chef = input.nextInt();
		        int partner = input.nextInt();
		        int moves = 0;
                while (chef != partner) {
                    if (chef < partner) {
                        moves += 1;
                        chef += 2;
                    } else if (chef > partner) {
                        moves += 1;
                        chef -= 1;
                    }    
                }
		        System.out.println(moves);
		    }
		}
        input.close();
	}
}
