package sort;

import java.util.ArrayList;
import java.util.Collections;

import customsorting.StudentDetails;

public class Student {

	public static void main(String[] args) {
		StudentDetails s1= new StudentDetails("Anupam" ,"Zope" ,89);
		StudentDetails s2= new StudentDetails("Deepak" ,"Dhake" ,9);
		StudentDetails s3= new StudentDetails("Rushikesh" ,"Pooja" ,85);
		StudentDetails s4= new StudentDetails("Pranay" ,"Mankar" ,19);

		ArrayList<StudentDetails> studlist=new ArrayList<>();
		studlist.add(s1);
		studlist.add(s2);
		studlist.add(s3);
		studlist.add(s4);
		
//		Student
//		StudentUtils.studList(studlist);
		System.out.println("After Sorting");
		StudentUtils.studList(studlist);
		Collections.sort(studlist);
		System.out.println("After Sorting");
		StudentUtils.studList(studlist);
		
		System.out.println("A".compareTo("Z"));
		System.out.println("B".compareTo("A"));
		System.out.println("A".compareTo("B"));
	}
}
