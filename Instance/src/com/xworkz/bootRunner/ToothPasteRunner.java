package com.xworkz.bootRunner;

import com.xworkz.boot.ToothPaste;
import com.xworkz.constants.BrandName;
public class ToothPasteRunner {

	public static void main(String[] args) {
	String[] name= {"Colgate","close up","dabur red"};
      ToothPaste toothpaste=new ToothPaste("Paste","ToothPaste","RED",BrandName.COLGATE,5,name);
      toothpaste.display();
	}

}
