package com.xworkz.inheitance.thing;

public class Bjp extends PoliticalParty {
	
	public String rulingNow;

	public Bjp(String rulingNow) {
		super("BJP",12000d);
		this.rulingNow=rulingNow;
	}
	

	@Override
	public void display() {
		super.display();
		System.out.println(this.rulingNow);
	}
}
