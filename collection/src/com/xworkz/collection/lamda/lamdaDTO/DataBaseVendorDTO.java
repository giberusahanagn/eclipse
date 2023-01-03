package com.xworkz.collection.lamda.lamdaDTO;

import com.xworkz.collection.lamda.lamdaConstant.Type;

public class DataBaseVendorDTO {
	private String name;
	private String developedBy;
	private int size;
	private Double licenseCost;
	private Type type;

	public DataBaseVendorDTO() {
		// TODO Auto-generated constructor stub
	}

	public DataBaseVendorDTO(String name, String developedBy, int size, Double licenseCost, Type type) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.size = size;
		this.licenseCost = licenseCost;
		this.type = type;
	}

	@Override
	public String toString() {
		return "DataBaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", size=" + size + ", licenseCost="
				+ licenseCost + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Double getLicenseCost() {
		return licenseCost;
	}

	public void setLicenseCost(Double licenseCost) {
		this.licenseCost = licenseCost;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
}
