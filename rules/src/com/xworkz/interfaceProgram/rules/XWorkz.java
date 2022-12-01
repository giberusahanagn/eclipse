package com.xworkz.interfaceProgram.rules;

public interface XWorkz extends DevelopingInstitute, TestingInstitute {
	@Override
	default boolean interview() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	default boolean placement() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	default boolean training() {
		// TODO Auto-generated method stub
		return false;
	}
}
