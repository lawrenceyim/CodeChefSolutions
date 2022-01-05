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
		        int points = input.nextInt();
		        if (points >= 200) {
		            System.out.println("Hard");
		        } else if (points >= 100) {
		            System.out.println("Medium");
		        } else {
		            System.out.println("Easy");
		        }
		    }
		}
        input.close();
	}
}
