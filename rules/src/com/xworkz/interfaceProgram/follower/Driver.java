package com.xworkz.interfaceProgram.follower;

public class Driver {

	Passanger passanger;

	public Driver(Passanger passanger) {

		this.passanger = passanger;
	}

	public void checkOut() {
		int check = this.passanger.wearMask();
		int check2 = this.passanger.noSmoking();

		if (passanger != null) {
			System.out.println("running checking");
			if (check == 0 && check2 == 0) {
				System.out.println("following rules");
			} else {
				System.err.println("not following");
			}
		}
	}
}
