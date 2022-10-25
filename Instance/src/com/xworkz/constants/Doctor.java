package com.xworkz.constants;

public enum Doctor {
	
	SWATHI(9972451281L,"Swathi"),SNEHA(456789876L,"Sneha"),JHANAVI(4567898654L,"Jhanavi")
			,DHRUTHI(456789765L,"Dhruthi");
	
	public long number;
	public String name;
	private Doctor(long numbers,String name) {
		this.number=numbers;
		this.name=name;
	}
}
