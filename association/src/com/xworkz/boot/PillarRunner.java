package com.xworkz.boot;

import com.xworkz.things.Company;
import com.xworkz.things.Pillar;

public class PillarRunner {
	public static void main(String[] args) {

		Pillar pillar = new Pillar();

		pillar.company.showOff("Built buildings", "Construction");
		System.out.println(System.lineSeparator());
		pillar.company.showOff("ACC", "cement comapny");
	}
}
