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
		        double petrolPrice = input.nextDouble();
		        double dieselPrice = input.nextDouble();
		        double petrolIncrease = input.nextDouble();
		        double dieselIncrease = input.nextDouble();
		        int months = input.nextInt();
		        petrolPrice += petrolIncrease * months;
		        dieselPrice += dieselIncrease * months;
		        if (petrolPrice < dieselPrice) {
		            System.out.println("PETROL");
		        } else if (dieselPrice < petrolPrice) {
		            System.out.println("DIESEL");
		        } else if (petrolPrice == dieselPrice) {
		            System.out.println("SAME PRICE");
		        }
		    }
		}
        input.close();
	}
}
