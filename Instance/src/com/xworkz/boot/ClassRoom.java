package com.xworkz.boot;

public class ClassRoom {
public String className;
public String standard;
public String studentName;
public char section;
public int noOfSection;
public int[] noOfStudentsInClass={45,54,34,89}; 
public int[] noOfStandard= {1,2,3,4,5,6,7,8,9,10};
public String[] studentsName= {"rutvik","shreya","jhanavi","dhruthi"};

public ClassRoom(String className,String standard,String studentName,char section,int noOfSection,
	int[] noOfStudentsInClass,int[] noOfStandard,String[] studentsName) {
	this.className=className;
	this.standard=standard;
	this.studentName=studentName;
	this.section=section;
	this.noOfSection=noOfSection;
	this.noOfStudentsInClass=noOfStudentsInClass;
	this.noOfStandard=noOfStandard;
	this.studentsName=studentsName;
}
public void display() {
	System.out.println(className);
	System.out.println(standard);
	System.out.println(studentName);
	System.out.println(section);
	System.out.println(noOfSection);
	System.out.println(noOfStudentsInClass);
	System.out.println(noOfStandard);
	System.out.println(studentsName);
}
}
