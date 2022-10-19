package com.xworkz.boot;

class Phone{

	
	 public String product;
	 public String productBrand;
	 public String OS;
	 public int price;
	 public String owner;
	 public String[] brandName;
	 public String[] nameOfUsers;
	 public String[] ram;
	 public long[] number;
	 public Phone(String product,String productBrand,String OS,
	 int price,String owner,String[] brandName,String[] nameOfUsers
	 ,String[] ram,long[] number){
		 this.product=product;
		 this.productBrand=productBrand;
		 this.OS=OS;
		 this.price=price;
		 this.owner=owner;
		 this.brandName=brandName;
		 this.nameOfUsers=nameOfUsers;
		 this.ram=ram;
		 this.number=number;
	 }
	 public void display(){
		 System.out.println(product);
		 System.out.println(productBrand);
		 System.out.println(OS);
		 System.out.println(price);
		 System.out.println(owner);
		 System.out.println("---brandName-----");
		 for(int index=0;index<brandName.length;index++){
			 System.out.println(brandName[index]);
		 }
		 System.out.println("--------nameOfUsers------");
		 for(int index=0;index<nameOfUsers.length;index++){
			 System.out.println(nameOfUsers[index]);
		 }
		 System.out.println("----ram-----");
		 for(int index=0;index<ram.length;index++){
			 System.out.println(ram[index]);
		 }
		 System.out.println("-----number-----");
		 for(int index=0;index<number.length;index++){
			 System.out.println(number[index]);
		 }
	 }
	    public static void main(String[] args){
		  String[] brandName={"OOPO","MI","Honnor","1+"};
	  String[] nameOfUsers={"Sahana","Swathi","Neelu","Komala"};
	  String[] ram={"3GB","4GB","8GB"};
	  long[] number={9972451281l,9008284717l,8722159292l,9481038849l};
	Phone phone=new Phone("Mobile","OOPO","Andriod",12000,"Sahana",brandName,nameOfUsers,ram,number);
	phone.display();

	}
	 }
