package com.xworkz.boot;

import com.xworkz.program.encapsulation.Product;
import com.xworkz.program.encapsulation.ProductAccess;

public class ProductRunner {
	public static void main(String[] args) {
		ProductAccess productAccess = new ProductAccess();
		Product product=new Product();
		productAccess.use();
	}
}
