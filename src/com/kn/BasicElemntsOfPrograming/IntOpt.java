package com.kn.BasicElemntsOfPrograming;

import java.util.Scanner;

public class IntOpt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a = scan.nextInt();
		System.out.println("Enter the second number :");
		int b = scan.nextInt();
		System.out.println("Enter the third number :");
		int c = scan.nextInt();
		
		int result1 = a + b *c;
		System.out.println("result1 : "+result1);
		
		int result2 = a * b + c;
		System.out.println("result2 : "+result2);
		
		int result3 = c + a /b;
		System.out.println("result3 : "+result3);
		
		int result4 = a % b + c;
		System.out.println("result4 : "+result4);
		scan.close();

	}

}
