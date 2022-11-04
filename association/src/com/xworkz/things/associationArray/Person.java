package com.xworkz.things.associationArray;

public class Person {
	public String name;
	public Email[] emails;
	public Job job = new Job();

	public Person() {

	}

	public void setEmail(String name, Email[] emails, Job job) {
		this.name = name;
		this.emails = emails;
		this.job = job;
	}

	public void showOff() {
		System.out.println("Name: " + name);
		job.showOff();
System.out.println(System.lineSeparator());
		if (emails != null && emails.length > 0) {
			for (int index = 0; index < emails.length; index++) {
				Email email = emails[index];
				if (email != null) {

					email.showOff();
					System.out.println(System.lineSeparator());
				} else {
					System.out.println("email is null");
				}

			}
		}

	}
}