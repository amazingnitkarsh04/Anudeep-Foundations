package com.introduction;

public class IntroductonString {
	public static void main(String[] args) {
		// to create string
		String brandString="pwskill";
		System.out.println(brandString);
		brandString.concat("Bangluru");
		System.out.println(brandString);// in summory of these output string is immutable 
		// there changes are when we concate the obj so that time first pwskill then after append 
		//another pwskill banglaru pointeed but theesis not pointed brand 
		// bts refer one point
		
		StringBuilder brand1 =new StringBuilder("Pwskills");
		
		System.out.println(brand1);
		brand1.append("bangaluru");
		System.out.println(brand1);// there mutable  changes in same object...
		
		
		
		
	}

}
