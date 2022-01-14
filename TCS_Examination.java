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
    		    int[] dragon = new int[3];
    		    int[] sloth = new int[3];
    		    dragon[0] = input.nextInt();
    		    dragon[1] = input.nextInt();
    		    dragon[2] = input.nextInt();
    		    sloth[0] = input.nextInt();
    		    sloth[1] = input.nextInt();
    		    sloth[2] = input.nextInt();
                int dragon_sum = dragon[0] + dragon[1] + dragon[2];
                int sloth_num = sloth[0] + sloth[1] + sloth[2];
                if (dragon_sum > sloth_num) {
                    System.out.println("Dragon");
                } else if (sloth_num > dragon_sum) {
                    System.out.println("Sloth");
                } else if (dragon[0] > sloth[0]) {
                    System.out.println("Dragon");
                } else if (sloth[0] > dragon[0]) {
                    System.out.println("Sloth");
                } else if (dragon[1] > sloth[1]) {
                    System.out.println("Dragon");
                } else if (sloth[1] > dragon[1]) {
                    System.out.println("Sloth");
                } else if (dragon[2] > sloth[2]) {
                    System.out.println("Dragon");
                } else if (sloth[2] > dragon[2]) {
                    System.out.println("Sloth");
                } else {
                    System.out.println("Tie");
                }
    		}
		}
		input.close();
	}
}
