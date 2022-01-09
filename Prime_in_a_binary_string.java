// Successful solution
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
		    int testcases = Integer.valueOf(in.nextLine());
		    for (int test = 0; test < testcases; test++) {
		        String input = in.nextLine();
		        if (is_prime(input)) System.out.println("YES");
		        else System.out.println("NO");
		    }
		}
		in.close();
	}

	public static boolean is_prime(String input) {
	    return input.contains("11") || input.contains("10");
	}
}


// Solution failed due to timeout
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		if (in.hasNext()) {
		    int testcases = Integer.valueOf(in.nextLine());
		    for (int test = 0; test < testcases; test++) {
		        String input = in.nextLine();
		        boolean is_prime = false;
		        for (int input_size = 1; input_size <= input.length(); input_size++) {
		            is_prime = check_for_prime(input, input_size);
		            if (is_prime) break;
		        }
		        if (is_prime) System.out.println("YES");
		        else System.out.println("NO");
		    }
		}
		
		
		in.close();
	}
	
	public static boolean check_for_prime(String input, int size) {
	    for (int i = 0; i <= input.length() - size; i++) {
	        long decimal_number = Long.parseLong(input.substring(i, i + size), 2);
	        if (isPrime(decimal_number)) {
	            return true;
	        }
	    }
	    return false;
	}
	
	public static boolean isPrime(long number) {
	    if (number <= 1) return false;
	    if (number == 2 || number == 5) return true;
	    if (number % 2 == 0 || number % 5 == 0) return false;
	    for (long i = 2; i <= Math.sqrt(number); ++i) {
	        if (number % i == 0) return false;
	    }
	    return true;
	}
}
