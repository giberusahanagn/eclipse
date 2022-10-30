package com.xworkz.things;

//Brand: name,gstNo,location:custom,rating
//showOff()
public class Brand {

	public String name = "Bharath Petroleum";
	public int gstNo = 18;
	public int rating = 5;
	public Location location = new Location();

	public void showOff() {

		System.out.println("Name of the Brand :" + name);
		System.out.println("GST of the Brand :" + gstNo);
		System.out.println("Rating of the Brand :" + rating);
		location.showOff("Rajajinagar", "Bangalore", "Karnataka", 560018l, "India");

	}
}
