package com.xworkz.collection.lamda.lamdaDTO;

public class PalaceDTO {
	private String name;
	private String location;
	private String builtBy;
	private boolean destroyed;
	private Double entryFee;

	public PalaceDTO() {
		// TODO Auto-generated constructor stub
	}

	public PalaceDTO(String name, String location, String builtBy, boolean destroyed, Double entryFee) {
		super();
		this.name = name;
		this.location = location;
		this.builtBy = builtBy;
		this.destroyed = destroyed;
		this.entryFee = entryFee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBuiltBy() {
		return builtBy;
	}

	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}

	public boolean isDestroyed() {
		return destroyed;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public Double getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(Double entryFee) {
		this.entryFee = entryFee;
	}

	@Override
	public String toString() {
		return "PalaceDTO [name=" + name + ", location=" + location + ", builtBy=" + builtBy + ", destroyed="
				+ destroyed + ", entryFee=" + entryFee + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof PalaceDTO) {
				PalaceDTO dto = (PalaceDTO) obj;
				if (dto.name.equals(this.name)) {
					System.out.println("name is mathecd :" + this.name);
					return true;
				}
			}
		}
		return false;
	}

}
