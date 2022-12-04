package com.xworkz.interfaceProgram.follower;

public class Staffs {

	Passanger passanger;

	public Staffs(Passanger passanger) {
		super();
		this.passanger = passanger;
	}

	public void checkOut() {

		if (passanger != null) {
			System.out.println("running checking");
			int check = this.passanger.wearMask();
			int check2 = this.passanger.noSmoking();
			if (check >= 20 && check2 == 0) {
				System.out.println("following rules");
			} else {
				System.err.println("not following");
			}
		}
	}
}
