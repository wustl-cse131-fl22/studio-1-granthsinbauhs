package studio1;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter year: ");	
		int leapYear = in.nextInt();
		
		boolean a = leapYear%4==0 && leapYear%100!=0 || leapYear%400==0;
		System.out.println(a);
	
	}

}
