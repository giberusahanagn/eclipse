package com.xworkz.interfaceProgram.rule;

import com.xworkz.interfaceProgram.ruler.Exams;

public class Trainees implements Exams {

	@Override
	public boolean copy() {
		System.out.println("abstract method");
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean pens() {
		System.out.println("abstract method");
		return false;
	}

	@Override
	public boolean prepare() {
		System.out.println("abstract method");
		return false;
	}

	@Override
	public String subject() {
		System.out.println("default method");
		return Exams.super.subject();
	}

	public void display() {
		
		copy();
		pens();
		prepare();
		subject();
		Exams.timings();
	}

}
