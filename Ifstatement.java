package com.codegnan.controlstatemenst;

import java.util.Scanner;

public class Ifstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int i = scanner.nextInt();
		if(i>0) {
			System.out.println("the number is positive "+i);
		}else {
			System.out.println("the number is negative "+i);
		}
		System.out.println("this statement always executes");
		scanner.close();
	}

}
