package com.kn.BasicElemntsOfPrograming;

import java.util.Scanner;

public class PrintThreeNumbers {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first name : ");
		String name1 = scan.nextLine();
		System.out.println("Enter the second name : ");
		String name2 = scan.nextLine();
		System.out.println("Enter the third name : ");
		String name3 = scan.nextLine();
		
		System.out.println("Hi "+name3+","+name2+" and "+name1+".");
		scan.close();
	}
}
