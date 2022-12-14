package com.xworkz.pizza.boot;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDTO;
import com.xworkz.pizza.service.PizzaService;
import com.xworkz.pizza.service.PizzaServiceImpl;

public class PizzaRunner {
	public static void main(String[] args) {

		PizzaService pizzaService = new PizzaServiceImpl();

		PizzaDTO dto = new PizzaDTO();
		dto.setPizzaName("Cheese Burst");
		dto.setPrice(200);
		dto.setCompany("Dominous");
		dto.setSize(PizzaSize.MEDIUM);
		dto.setFalvor("Pepperoni");
		dto.setType("Veg");
		dto.setCreatedBy("System");
		dto.setCreatedDate(LocalDateTime.now());
		dto.setUpdatedBy("Sahana");
		dto.setUpdatedDate(LocalDateTime.now());
		pizzaService.saveAndValidate(dto);

		PizzaDTO dto1 = new PizzaDTO();
		dto1.setPizzaName("Cheese Burst");
		dto1.setPrice(200);
		dto1.setCompany("Dominous");
		dto1.setSize(PizzaSize.MEDIUM);
		dto1.setFalvor("Pepperoni");
		dto1.setType("Veg");
		dto1.setCreatedBy("System");
		dto1.setCreatedDate(LocalDateTime.now());
		dto1.setUpdatedBy("Sahana");
		dto1.setUpdatedDate(LocalDateTime.now());
		pizzaService.saveAndValidate(dto1);
	}
}
