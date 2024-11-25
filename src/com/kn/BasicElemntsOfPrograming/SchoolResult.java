package com.kn.BasicElemntsOfPrograming;

import java.util.ArrayList;
import java.util.Scanner;


public class SchoolResult {

	public static void main(String[] args) {
		
		
		NewSchoolOfLearning student1 = new NewSchoolOfLearning("Dinesh", 30, 40, 50);
		NewSchoolOfLearning student2 = new NewSchoolOfLearning("Lokesh", 25, 35, 45);
		NewSchoolOfLearning student3 = new NewSchoolOfLearning("Suresh", 30, 50, 25);
		
		ArrayList<NewSchoolOfLearning> students = new ArrayList<NewSchoolOfLearning>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		int i=1;
		while(i<=6) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the student name : ");
		String Name = scan.nextLine();
		boolean f = false;
		
		for(NewSchoolOfLearning sch : students) {
			if(sch.getStudentName().equalsIgnoreCase(Name)) {
				display(sch);
				f = true;
				break;
			}
			
		}
		if(f == false) {
			System.out.println("Not found");
			
		}i++;
		}
		
		
		
		
		
	}
		
		
		
	 static	void display(NewSchoolOfLearning result) {
		 System.out.println("Name "+" Physics " +"Chemistry "+"Mathematics "+ "Total_Marks " +"%"+"\n");
			System.out.println(result.studentName + " "+ result.getMarksInphysics()+"      "+
		result.getmarksInChemistry()+"       "+result.getmarksInMathematics()+"           "+result.gettotalMarks()+"        "
		+result.getPercentage());
		}
		
		
		
		
	

}
