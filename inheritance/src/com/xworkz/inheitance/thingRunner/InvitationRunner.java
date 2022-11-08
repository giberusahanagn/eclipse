package com.xworkz.inheitance.thingRunner;

import com.xworkz.inheitance.thing.Invitation;
import com.xworkz.inheitance.thing.MarriageInvitation;

public class InvitationRunner {
	public static void main(String[] args) {
		Invitation invitation = new Invitation();
		System.out.println(System.lineSeparator());
		Invitation invitation2 = new Invitation(null, 0, 0);
		System.out.println(System.lineSeparator());

		Invitation invitation3 = new MarriageInvitation();
		System.out.println(System.lineSeparator());

		Invitation invitation4 = new MarriageInvitation("MarriageInvitation", 6788, 7000, "Invitaion", 7000,
				"Bangalore");
	}
}
