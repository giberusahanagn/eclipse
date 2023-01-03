package com.xworkz.collection.lamda.lamdaDTO;

import java.io.Serializable;

public class MovieDTO implements Serializable {

	private String name;
	private String directedBy;
	private Integer price;
	private String lang;

	public MovieDTO() {
		// TODO Auto-generated constructor stub
	}

	public MovieDTO(String name, String directedBy, int price, String lang) {
		super();
		this.name = name;
		this.directedBy = directedBy;
		this.price = price;
		this.lang = lang;
	}

	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", directedBy=" + directedBy + ", price=" + price + ", lang=" + lang + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof MovieDTO) {
				MovieDTO dto = (MovieDTO) obj;
				if (this.name.equals(dto.name)) {
					System.out.println("same name");
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 30;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirectedBy() {
		return directedBy;
	}

	public void setDirectedBy(String directedBy) {
		this.directedBy = directedBy;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
