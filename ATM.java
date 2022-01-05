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
            double withdraw = input.nextDouble();
            double balance = input.nextDouble();
            if (withdraw <= (balance - 0.50) && withdraw % 5 == 0) {
                double result = balance - withdraw -0.50;
                System.out.printf("%.2f", result);
            }
            else System.out.printf("%.2f", balance);
        }
        input.close();
	}
}
