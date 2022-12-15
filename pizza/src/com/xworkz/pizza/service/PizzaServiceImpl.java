package com.xworkz.pizza.service;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDTO;

public class PizzaServiceImpl implements PizzaService {

	boolean output1 = true;
	boolean output2 = true;

	@Override
	public boolean saveAndValidate(PizzaDTO dto) {
		if (dto != null && dto.getPizzaName() == "Cheese Burst") {
			System.out.println("running get Pizza name");
			System.out.println("name matched" + dto);
			System.out.println(output1);
		} else {
			System.err.println("name not matched...");
		}
		System.out.println(System.lineSeparator());
		if (dto.getPrice() >= 60 && dto.getPrice() <= 2000) {
			System.out.println("running get Pizza prize");
			System.out.println("name matched" + dto);
			System.out.println(output1);
		} else {
			System.err.println("name not matched...");
		}
		System.out.println(System.lineSeparator());
		if (dto != null && dto.getCompany() == "Dominous" && dto.getCompany().length() >= 4
				&& dto.getCompany().length() <= 20) {
			System.out.println("running get Pizza Company name");
			System.out.println("Company name matched" + dto);
			System.out.println(output1);

		} else {
			System.err.println("name not matched...");
		}
		System.out.println(System.lineSeparator());
		if (dto != null && dto.getSize() == PizzaSize.LARGE) {
			System.out.println("running get Size");
			System.out.println("Size  matched" + dto);
			System.out.println(output1);

		} else if (dto != null && dto.getSize() == PizzaSize.MEDIUM) {
			System.out.println("running get Pizza Size");
			System.out.println("Size matched" + dto);
			System.out.println(output1);
		} else if (dto != null && dto.getSize() == PizzaSize.SMALL) {
			System.out.println("running get Pizza Company Size");
			System.out.println("Size matched" + dto);
			System.out.println(output1);
		} else {
			System.err.println("Size not matched...");
		}
		if (dto != null && dto.getFalvor() == "Pepperoni" && dto.getFalvor().length() >= 3
				&& dto.getFalvor().length() <= 20) {
			System.out.println(System.lineSeparator());
			System.out.println("running get Pizza Flavour....");
			System.out.println("getFalvor matched" + dto);
			System.out.println(output1);
		} else {
			System.err.println("name not matched...");
		}
		if (dto != null && dto.getType() == "Veg") {
			System.out.println(System.lineSeparator());
			System.out.println("running get Size");
			System.out.println("Type name matched" + dto);
			System.out.println(output1);
			
		} else if (dto != null && dto.getType() == "NonVeg") {
			System.out.println("running get Pizza Size");
			System.out.println("Type name matched" + dto);
			System.out.println(output1);
		} else {
			System.err.println("Type not matched..");
		}

		if (output1 && output2) {
			System.out.println(" checking condition output1 && output2 -->mathed");
			return true;
		}
		System.err.println("not matedcd");
		return false;
	}

}
