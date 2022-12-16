package com.xworkz.pizza.service;

import com.xworkz.pizza.constant.HelmetColor;
import com.xworkz.pizza.constant.HelmetType;
import com.xworkz.pizza.dto.HelmetDTO;
import com.xworkz.pizza.repository.HelmetRepository;

public class HelmetServiceImpl implements HelmetService {

	private HelmetRepository helmetRepository;

	boolean validType = true;
	boolean validColor = true;
	boolean validBrand = true;
	boolean validPrice = true;

	public HelmetServiceImpl(HelmetRepository helmetRepository) {
		this.helmetRepository = helmetRepository;
	}

	@Override
	public boolean ValidateAndSave(HelmetDTO dto) {
		HelmetType type = dto.getType();// not null,
		HelmetColor color = dto.getColor();// not null
		String brand = dto.getBrand();// not null >4,<20
		Double price = dto.getPrice();// not null,>500,<10000
		if (type != null) {
			System.out.println("type mathed.." + type);
			validType = true;
		} else {
			System.err.println("type not matched :" + type);
		}
		if (color != null) {
			System.out.println("color mathed.." + color);
			validColor = true;
		} else {
			System.err.println("color not matched :" + color);
		}
		if (brand != null && brand.length() >= 4 && brand.length() <= 20) {
			System.out.println("brand mathed.." + brand);
			validBrand = true;
		} else {
			System.err.println("brand not matched :" + brand);
		}
		if (price != null && price >= 500 && price <= 20000d) {
			System.out.println("price mathed.." + price);
			validBrand = true;
		} else {
			System.err.println("price not matched :" + price);
		}

		if (validBrand && validColor && validPrice && validPrice) {
			boolean saved = this.helmetRepository.save(dto);
			System.out.println(saved);
			return true;
		}
		return false;
	}

}
