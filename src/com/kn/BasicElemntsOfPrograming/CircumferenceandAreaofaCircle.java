package com.kn.BasicElemntsOfPrograming;

import java.util.Scanner;

public class CircumferenceandAreaofaCircle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the radius in inch : ");
		double radius = scan.nextDouble();
		
		double circumferance = 2 * 3.14 * radius;
		
		double area = 3.14 * radius * radius;
		
		System.out.println("circumferance : "+circumferance);
		System.out.println("area : "+area);
		scan.close();

	}

}
