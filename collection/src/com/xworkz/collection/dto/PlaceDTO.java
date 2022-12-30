package com.xworkz.collection.dto;

public class PlaceDTO {

	private String name;
	private String source;
	private String dest;

	public PlaceDTO() {
		// TODO Auto-generated constructor stub
	}

	public PlaceDTO(String name, String source, String dest) {
		super();
		this.name = name;
		this.source = source;
		this.dest = dest;
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", source=" + source + ", dest=" + dest + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals....");
		if (obj != null) {
			if (obj instanceof Object) {
				PlaceDTO placeDTO = (PlaceDTO) obj;
				if (this.name.equals(placeDTO.name) && this.source.equals(placeDTO.source) 
						&& this.dest.equals(placeDTO.dest)) {
					System.out.println("data matched....");
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

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

}
