package com.kn.BasicElemntsOfPrograming;

public class NewSchoolOfLearning {
	
	String studentName;
	int marksInphysics;
	int marksInchemistry;
	int marksInmathematics;
	public NewSchoolOfLearning(String studentName,int marksInphysics, int chemistry, int mathematics) {
		super();
		this.studentName = studentName;
		this.marksInphysics = marksInphysics;
		this.marksInchemistry = chemistry;
		this.marksInmathematics = mathematics;
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarksInphysics() {
		return marksInphysics;
	}
	public void setMarksInphysics(int marksInphysics) {
		this.marksInphysics = marksInphysics;
	}
	public int getmarksInChemistry() {
		return marksInchemistry;
	}
	public void setmarksInChemistry(int chemistry) {
		this.marksInchemistry = chemistry;
	}
	public int getmarksInMathematics() {
		return marksInmathematics;
	}
	public void setmarksInMathematics(int mathematics) {
		this.marksInmathematics = mathematics;
	}

	@Override
	public String toString() {
		return "NewSchoolOfLearning [studentName=" + studentName + ", marksInphysics=" + marksInphysics
				+ ", marksInchemistry=" + marksInchemistry + ", marksInmathematics=" + marksInmathematics + "totalMarks ="+gettotalMarks()+"getPercentage ="+getPercentage()+ "]";
	}
	public int gettotalMarks() {
		return marksInphysics + marksInchemistry + marksInmathematics ;
	}
	
	public double getPercentage() {
        int totalMarks = gettotalMarks();
        int maximumMarks = 150;
        return (totalMarks / (double) maximumMarks) * 100;
    }
	
}
