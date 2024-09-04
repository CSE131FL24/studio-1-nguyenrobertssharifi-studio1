package studio1;
import java.util.Scanner;

public class Average {
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("enter n1: ");
		int n1 = scan.nextInt ();
		System.out.print("enter n2: ");
		int n2 = scan.nextInt ();
		double average = ((double) n1 + (double) n2) / 2;
		System.out.println ("The average of your two numbers is " + average + ". ");
	}
}
