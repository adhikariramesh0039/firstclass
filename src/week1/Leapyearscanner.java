package week1;

import java.util.Scanner;

public class Leapyearscanner {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("enter year");
		
int year=scan.nextInt();

if (year%4==0) {System.out.println(year+ "is leap year"+ year);}

else         {System.out.println(year+ "is not a leap year");}

	}

}

