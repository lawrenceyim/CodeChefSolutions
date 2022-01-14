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
		    int tests = input.nextInt();
		    for (int i = 0; i < tests; i++) {
		        int deposits = input.nextInt();
		        int amount_required = input.nextInt();
		        int[] deposit_amounts = new int[deposits];
		        int deposits_needed = 0;
		        int amount = 0;
		        for (int j = 0; j < deposits; j++) {
		            deposit_amounts[j] = input.nextInt();
		        }
		        Arrays.sort(deposit_amounts);
		        for (int j = deposit_amounts.length - 1; j >= 0; j--) {
		            if (amount < amount_required) {
		                deposits_needed++;
		            }
		            amount += deposit_amounts[j];
		        }
		        System.out.println(amount >= amount_required ? deposits_needed : "-1");
		    }
		}
		input.close();
	}
}
