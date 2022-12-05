package com.xworkz.exception.type;

import com.xworkz.exception.rules.XworkzRule;

public class JavaTrainee extends Person implements XworkzRule {

	public JavaTrainee(String name, int age, double dOB, String location, long number) {
		super(name, age, dOB, location, number);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean uploadedTask() {
		System.out.println("running upload Task");
		return false;
	}

	@Override
	public boolean completedProgram() {
		System.out.println("running completed Program");
		return false;
	}

	public void training() {
		System.out.println("running training method in java trainee");

	}

	public void exceuteProgram() {
		System.out.println("running exceute Program method in java trainee");

	}

	// public abstract void training();
	// public abstract void exceuteProgram();
	// Cannot declare abstarct method
}
