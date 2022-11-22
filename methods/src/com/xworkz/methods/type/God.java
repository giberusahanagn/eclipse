package com.xworkz.methods.type;

public class God {
String hindu;
String muslim;
String christianity;
String buddisum;
String jainism;
String sikhism;
String islam;
public God(String hindu, String muslim, String christianity, String buddisum, String islam) {
	super();
	this.hindu = hindu;
	this.muslim = muslim;
	this.christianity = christianity;
	this.buddisum = buddisum;
	this.islam = islam;
}
@Override
public boolean equals(Object obj) {
	if(obj instanceof God) {
		
		God casted=(God)obj;
		if(this.hindu.equals(casted.hindu) && this.muslim.equals(casted.muslim) && 
				this.christianity.equals(casted.christianity) && this.islam.equals(casted.islam)) {
			System.out.println("values are same");
			System.out.println(" god class: comparing 5 properties");
			return true;
		}
		else {
			System.err.println("values are not same");
		}
	}
	return false;
}
}
