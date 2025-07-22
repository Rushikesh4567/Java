package com.work;

interface StudentInfo 
{
	 void getDetails();
	 String calculateGrade();
}

class EngineeringStudent implements StudentInfo 
{
	 private String name;
	 private int[] marks; // marks of 3 subjects
	
	 public EngineeringStudent(String name, int[] marks) 
	 {
	     this.name = name;
	     this.marks = marks;
	 }

	 public void getDetails() 
	 {
	     System.out.println("Student: " + name);
	     System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
	 }

	 public String calculateGrade() 
	 {
	     int total = marks[0] + marks[1] + marks[2];
	     double avg = total/3.0;
	
	     if (avg >= 85) return "A";
	     else if (avg >= 70) return "B";
	     else if (avg >= 50) return "C";
	     else return "Fail";
	 }
}


public class Teststudent 
{
	 public static void main(String[] args) 
	 {
	     int[] marks = {85, 78, 92};
	     EngineeringStudent student = new EngineeringStudent("Rushikesh", marks);
	     student.getDetails();
	     System.out.println("Grade: " + student.calculateGrade());
	     
	 }
}
