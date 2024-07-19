package com.ruby.java.test1;

public class Test {
	public static void main(String[]args) {
		Aromr armor = new Aromr();
		armor.takeOff();
//		armor.land();
//		armor.shootLaser();
//		armor.launchMissile();
//		
//		System.out.println("Name : " + armor.name);
//		System.out.println("Height : " + armor.height);
//		System.out.println("Weight : " + armor.weight);
//		System.out.println("Color : " + armor.color);
//		System.out.println("Fly : " + armor.isFly);
//		armor.isFly = false;
//		System.out.println();
//		armor.takeOff();
		
		armor.setData("flower", 10, 5, "Pink");
	
//		armor.setName("star");
//		armor.setHighet(90);
//		armor.setWeight(50);
//		armor.setColor("yellow");

		
		
		System.out.println(armor.name);
		System.out.println(armor.height);
		System.out.println(armor.weight);
		System.out.println(armor.color);
	}

}





