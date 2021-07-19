/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	      Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        while (testCase > 0) {

            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();

            int amount = y - x;
            int years = amount / z;

            System.out.println(years);

            --testCase;
        }
	}
}
