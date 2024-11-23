package com.kn.BasicElemntsOfPrograming;

import java.util.Scanner;

public class TemperatureViceversa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value : ");
		double temp = scan.nextDouble();
		double fahrenheit = (temp * 9/5) + 32;
		
		double celsius = (5.0/9)*(fahrenheit - 32);
		
		
		System.out.println(celsius);
		scan.close();

	}

}
