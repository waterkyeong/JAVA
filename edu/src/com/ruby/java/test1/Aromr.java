package com.ruby.java.test1;

public class Aromr {
	
			String name = "John";
			int height = 185;
			int weight = 100;
			String color = "Red";
			boolean isFly = true;
			
			void setData(String n, int h, int w, String cor) {
				name = n;
				height = h;
				weight = w;
				color = cor;
			}
//			void setName(String ser) {
//				name = ser;
//			}
//			void setHighet(int h) {
//				height = h;
//			}
//			void setWeight(int w) {
//				weight = w;
//			}
//			void setColor(String cor) {
//				color = cor;
//			}
			
			
			void takeOff() {
				System.out.println("takeoff");
				if (isFly) {
					System.out.println("날 수 있습니다.");
				}
				else {
					System.out.println("날 수 없습니다.");
				}
			}
			void land() {
				System.out.println("land");
			}
			void shootLaser() {
				System.out.println("shootlaser");
			}
			void launchMissile() {
				System.out.println("launchmissile");
			}
}
