package com.kn.BasicElemntsOfPrograming;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value : ");
		double temp = scan.nextDouble();
		double celsius = (5.0/9)*(temp - 32);
		
		double fahrenheit = (celsius * 9/5) + 32;
		System.out.println(fahrenheit);
		scan.close();

	}

}
