package com.xworkz.collection.lamda.lamdaDTO;

public class DaugtherDTO {
	private String name;
	private long number;
	private int age;
	private boolean commited;
	private boolean alive;

	public DaugtherDTO() {
		// TODO Auto-generated constructor stub
	}

	public DaugtherDTO(String name, long number, int age, boolean commited, boolean alive) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
		this.commited = commited;
		this.alive = alive;
	}

	@Override
	public String toString() {
		return "DaugtherDTO [name=" + name + ", number=" + number + ", age=" + age + ", commited=" + commited
				+ ", alive=" + alive + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCommited() {
		return commited;
	}

	public void setCommited(boolean commited) {
		this.commited = commited;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public void details() {
		System.out.println(this.getName());
		System.out.println(this.getNumber());
		System.out.println(this.getAge());
		System.out.println(this.isCommited());
		System.out.println(this.isAlive());
	}
}
