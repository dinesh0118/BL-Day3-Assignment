package com.kn.BasicElemntsOfPrograming;

import java.util.Scanner;

public class FavoritePlaces {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the your first favorate city ");
		String city1 = scan.nextLine();
		System.out.println("Enter the your second favorate city ");
		String city2 = scan.nextLine();
		System.out.println("Enter the your third favorate city ");
		String city3 = scan.nextLine();
		System.out.println("Enter the your fourth favorate city ");
		String city4 = scan.nextLine();
		System.out.println("Enter the your first favorate city ");
		String city5 = scan.nextLine();
		
		System.out.println(city1+", "+city2+", "+city3+", "+city4+", "+city5);
		scan.close();

	}

}
