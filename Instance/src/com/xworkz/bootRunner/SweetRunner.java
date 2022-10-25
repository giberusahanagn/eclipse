package com.xworkz.bootRunner;

import com.xworkz.boot.Sweet;

public class SweetRunner {

	public static void main(String[] args) {
		Sweet sweet = new Sweet(450d);
		System.out.println(sweet.price);

		sweet.setName("Jalibi");
		String shape = "Round";
		System.out.println(shape);

		sweet.display();
	}

}
