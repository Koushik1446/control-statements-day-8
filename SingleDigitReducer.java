package com.codegnan.controlstatemenst;

import java.util.Scanner;

public class SingleDigitReducer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		while(number>=10) {
			int  digitsum = 0;
			while(number>0) {
				int lastdigit = number%10;
				digitsum += lastdigit;
				number = number/10;
			}
			number = digitsum;
	}
		System.out.println(number);
		scanner.close();
	}	

}
