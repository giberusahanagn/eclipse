package com.xworkz.collection.dto;

public class AirportDTO {
	private String name;
	private String source;
	private String destination;

	public AirportDTO() {
		// TODO Auto-generated constructor stub
	}

	public AirportDTO(String name, String source, String destination) {
		super();
		this.name = name;
		this.source = source;
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "AirportDTO [name=" + name + ", source=" + source + ", destination=" + destination + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals...");
		if (obj != null) {
			if (obj instanceof AirportDTO) {
				AirportDTO airportDTO = (AirportDTO) obj;
				if (this.name.equalsIgnoreCase(airportDTO.name) &&this.source.equalsIgnoreCase(airportDTO.source)&&this.destination.equalsIgnoreCase(airportDTO.destination)  ) {
					System.out.println("name mathced...");
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

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

}
