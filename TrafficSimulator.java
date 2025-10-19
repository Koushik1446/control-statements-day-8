package com.codegnan.controlstatemenst;

import java.util.Scanner;

public class TrafficSimulator {

	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the light state(green/yellow/red):");
		String lightState = scanner.next();
		System.out.println("enter the hours 0-23(24 hrs ):");
		int hour = scanner.nextInt();
		boolean isDaytime = (hour >= 6 && hour <=18);
		String action;
		if(lightState.equalsIgnoreCase("green")) {
			action ="Go";
		}else {
			if(lightState.equalsIgnoreCase("red")) {
				action="stop";
			}else {
				if(lightState.equalsIgnoreCase("yellow")) {
					if(isDaytime) {
						action="slow"; 		
					}else {
						action ="stop";  
					}
				}else {
					action = "Invalid light state"; 
				}
			}
		}
		System.out.println(action);
		scanner.close();
		}

}

