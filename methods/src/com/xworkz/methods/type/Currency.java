package com.xworkz.methods.type;

public class Currency {

	private String india;
	private String austria;
	private String argentina;
	private String armenia;
	private String australia;
	private String america;
	private String china;
	private String japan;
	private String srilanka;
	private String nepal;
	public Currency(String india, String austria, String argentina, String armenia) {
		super();
		this.india = india;
		this.austria = austria;
		this.argentina = argentina;
		this.armenia = armenia;
	}
	
	@Override
	public boolean equals(Object obj) {
	if(obj instanceof Currency) {
		Currency casted=(Currency)obj;
		if(this.india.equals(casted.india)
				&& this.austria.equals(casted.austria)&& this.argentina.equals(casted.argentina)
				&& this.armenia.equals(casted.armenia))
		{
			System.out.println(" 4 properties matched");
			return true;
		}
		else {
			System.err.println("not matched");
		}
	}
		return false;
	}
}
