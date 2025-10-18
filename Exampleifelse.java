package com.codegnan.controlstatemenst;

import java.util.Scanner;

public class Exampleifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance=10000;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw:");
		double amount = scanner.nextDouble();
		if(amount<=balance) {
			balance -= amount;
			System.out.println("withdraw succesfuf ,remaining balance:"+balance);
		}else {
			System.out.println("insufficient balance");
	}
		scanner.close();
}
}