package com.xworkz.collection.lamda.lamdaDTO;

public class ApplicationDTO {

	private String name;
	private String developedBy;
	private Double price;
	private Double version;
	private boolean free;

	public ApplicationDTO() {
		System.out.println("defalut const..");
	}

	public ApplicationDTO(String name, String developedBy, Double price, Double version, boolean free) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.price = price;
		this.version = version;
		this.free = free;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", developedBy=" + developedBy + ", price=" + price + ", version="
				+ version + ", free=" + free + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof PalaceDTO) {
				ApplicationDTO dto = (ApplicationDTO) obj;
				if (dto.name.equals(this.name)) {
					System.out.println("name is mathecd :" + this.name);
					return true;
				}
			}
		}
		return false;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getVersion() {
		return version;
	}

	public void setVersion(Double version) {
		this.version = version;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

}
