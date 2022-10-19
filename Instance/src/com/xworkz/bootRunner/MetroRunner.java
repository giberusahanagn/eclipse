package com.xworkz.bootRunner;
import com.xworkz.boot.Metro;

public class MetroRunner {
	public static void main(String[] args) {
		String[] sourceName= {"majestic","Market","Rajajinagar","kengeri"};
	       String[] destinationName= {"KR Market","Majestic","Magadi","SriRamPura"};
	       String[] mergeName= {"Majestic","Market","MAlleshwaram"};
	       String[] seatType= {"For HandiCap's","for ladies","for senior citizen's","for pregent ladies"};
	       int[] smartCardId= {34,1,5,6};
    Metro metro=new Metro("BMRCL","Bangalore","Sneha","MAjestic","market",8,sourceName,destinationName,mergeName,seatType,smartCardId);
	metro.display();
	}

}
