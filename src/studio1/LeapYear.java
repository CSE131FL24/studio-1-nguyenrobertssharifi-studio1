package studio1;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter year: ");
		int year = scan.nextInt();
		
		boolean isLeapYear;
		if((year % 4 == 0 ) && (year % 100 != 0) || (year % 400 == 0)){
			isLeapYear = true;
		} else {
			isLeapYear = false;
		}
		
		System.out.print(year + " is a leap year: " + isLeapYear);
	}

}
