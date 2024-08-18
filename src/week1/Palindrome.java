package week1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int palNum = 0;
        int count = 0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Number: ");
        int checkNum = scan.nextInt(); // 123
        
        int originalNum = checkNum; // This Stores the original number
        while (checkNum > 0) {
            int d = checkNum % 10;
            count = count * 10 + d;
            checkNum = checkNum / 10;
        }
        System.out.println(" Check Reverse Number: " + count);
        
        if (count == originalNum) { // Compare with the original number, not the reversed one
            System.out.println("This is a Palindrome Number");
        } else {
            System.out.println("This is not a Palindrome Number");
        }
    }



}
