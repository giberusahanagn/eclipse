package com.xworkz.interfaceProgram.boot;

import com.xworkz.interfaceProgram.ruler.*;
import com.xworkz.interfaceProgram.rule.*;

public class Runner {
	public static void main(String[] args) {

		Trainees trainees = new Trainees();
		trainees.display();
		System.out.println(System.lineSeparator());
		Exams exams = new Trainees();
		Trainees trainees2 = (Trainees) exams;
		trainees2.display();
		System.out.println("--------------------------");

		Doctor doctor = new Doctor();
		doctor.display();
		System.out.println(System.lineSeparator());
		Hospital hospital = new Doctor();
		hospital.display();
		System.out.println("--------------------------");
		System.out.println("Hospital class");
		Hostellers hostel = new Hostellers();

		hostel.display();
		System.out.println(System.lineSeparator());
		Hostel hostel2 = new Hostellers();
		hostel2.display();
		System.out.println("------------------");

		BankAccountHolder accountHolder = new BankAccountHolder();
		accountHolder.show();
		System.out.println(System.lineSeparator());
		BankRules bankRules = new BankAccountHolder();
		BankAccountHolder accountHolder2 = (BankAccountHolder) bankRules;
		accountHolder2.dispaly();

		System.out.println("-------------------------");
		System.out.println("Traffic class");
		Citizen citizen = new Citizen();
		citizen.display();
		System.out.println(System.lineSeparator());
		Traffic traffic = new Citizen();
		traffic.display();
		System.out.println("-------------------------");

		System.out.println("HR class");
		Employee employee = new Employee();
		employee.display();
		System.out.println(System.lineSeparator());
		HR hr = new Employee();
		Employee employee2 = (Employee) hr;
		employee2.display();
		System.out.println("-------------------------");

		Pan pan = new Pan();
		pan.display();
		System.out.println(System.lineSeparator());
		ID id = new Pan();
		Pan pan2 = (Pan) id;
		pan2.display();
		System.out.println("-------------------------");
		System.out.println("Army class");

		ArmyPerson armyPerson = new ArmyPerson();
		armyPerson.display();
		System.out.println(System.lineSeparator());
		ArmyRule armyRule = new ArmyPerson();
		System.out.println(" after type casting");
		ArmyPerson armyPerson2 = (ArmyPerson) armyRule;
		armyPerson2.display();
		System.out.println("-------------------------");
		System.out.println("House class");

		HouseEmployee houseEmployee = new HouseEmployee();
		houseEmployee.show();
		House house = new HouseEmployee();
		HouseEmployee house2 = (HouseEmployee) house;
		house2.show();
		System.out.println("-------------------------");
		System.out.println("laptop class");

		HP hp = new HP();
		hp.show();
		Laptop laptop = new HP();
		System.out.println(System.lineSeparator());
		HP hp2 = (HP) laptop;
		hp2.showOff();

		System.out.println("-------------------------");

		Oppo oppo = new Oppo();
		oppo.display();
		Phone phone = new Oppo();
		phone.price();

		System.out.println("-------------------------");
		WhatsUp up = new WhatsUp();
		up.companyName();
		System.out.println(System.lineSeparator());
		App app = new WhatsUp();
		WhatsUp up2 = (WhatsUp) app;
		up2.companyName();

		System.out.println("-------------------------");
		Raimond raimond = new Raimond();
		raimond.display();
		System.out.println(System.lineSeparator());
		Shirt shirt = new Raimond();
		Raimond raimond2 = (Raimond) shirt;
		raimond2.brandName();

		System.out.println("-------------------------");
		ITCompany company=new ITCompany();
		company.display();
		
		System.out.println(System.lineSeparator());
		Interview interview=new ITCompany();
	
	}
}
