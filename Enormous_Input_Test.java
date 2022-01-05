import java.io.*;
import java.util.*;
import java.lang.*;

// Remember that the class name should be "Main" and should be "public".
public class Main {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        if (input.hasNext()) {
            int n = input.nextInt();
    		int k = input.nextInt();

    		for (int i = 0; i < n; i++) {
    			int x = input.nextInt();
    			if (x % k == 0) {
    				count++;
    			}
    		}    
        }
        input.close();
		System.out.println(count);
	}
}