package com.xworkz.collection.lamda.lamdaInterface;

@FunctionalInterface
public interface NewYear {

	void year(int year);

//	@Override
	default int getYear() {
		return 0;
	}

}
