package com.codegnan.controlstatemenst;

import java.util.Scanner;

public class PalindromeCounter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int upperlimit = scanner.nextInt();
		int currentNumber = 1;
		int palindromeCount=0;
		
		while(currentNumber<=upperlimit) {
			int originalNumber=currentNumber;
			int numberToReverse=originalNumber;
			int reversedNumber=0;
			
			while(numberToReverse>0) {
				int lastDigit = numberToReverse%10;
				reversedNumber = reversedNumber*10+lastDigit;
				numberToReverse = numberToReverse/10;
			}
			if(originalNumber==reversedNumber);{
				palindromeCount++;	
			}
			currentNumber++;
			
		}
		System.out.println(palindromeCount);
		scanner.close();

		
	}

}
