package com.xworkz.collection.lamda.lamdaDTO;

public class CompanyCEODTO {
	private String name;
	private String company;
	private int age;
	private String country;
	private String qualification;
	private boolean married;
	private DaugtherDTO daughterDTO;

	public CompanyCEODTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	DaugtherDTO daugtherDTO = new DaugtherDTO("janu", 9008284717l, 12, false, true);

	public CompanyCEODTO(String name, String company, int age, String country, String qualification, boolean married,
			DaugtherDTO daughterDTO) {
		// super(name, age, age, married, married);
		this.name = name;
		this.company = company;
		this.age = age;
		this.country = country;
		this.qualification = qualification;
		this.married = married;
		this.daughterDTO = daughterDTO;
		//daughterDTO.details();
	}

	@Override
	public String toString() {
		return "CompanyCEODTO [name=" + name + ", company=" + company + ", age=" + age + ", country=" + country
				+ ", qualification=" + qualification + ", married=" + married + ", daughterDTO=" + daughterDTO+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public DaugtherDTO getDaughterDTO() {
		return daughterDTO;
	}

	public void setDaughterDTO(DaugtherDTO daughterDTO) {
		this.daughterDTO = daughterDTO;
	}

}
