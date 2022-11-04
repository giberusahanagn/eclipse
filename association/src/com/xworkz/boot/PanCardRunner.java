package com.xworkz.boot;

import com.xworkz.program.encapsulation.PanCard;
import com.xworkz.program.encapsulation.PanCardAccess;

public class PanCardRunner {
public static void main(String[] args) {
	PanCard card =new PanCard();
	PanCardAccess access=new PanCardAccess();
	access.usePanCard();
}
}
