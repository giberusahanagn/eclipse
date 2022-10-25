package com.xworkz.bootRunner;

import com.xworkz.boot.Saloon;
import com.xworkz.constants.ShopName;

public class SaloonRunner {

	public static void main(String[] args) {

		Saloon saloon = new Saloon(ShopName.Lakshmi_saloon);
		saloon.price = 10;
		saloon.display();
	}
}
