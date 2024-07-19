package quiz;

public class Quiz03_cylinder {
		
		static int r = 5;
		static int h = 10;
		
		
		//부피 PI*radius*radius*height
		//겉넓이 PI*radius*radius*2+(2*PI*radius)*height
		
		static void getVolume() {
			
			System.out.println("원기둥의 부피:"+ Math.PI*r*r*h);
			
		}
		
		static void getArea() {
			
			System.out.println("원기둥의 겉넓이: " + Math.PI*r*r*2+(2*Math.PI*r)*h);
		}
		
public static void main(String[]arg) {
	getVolume();
	getArea();
	
}
	
//	//여기부턴 교수님 해답
//	static int radius = 5; //반지름
//	static int height = 10; //높이
//	
//	static double getVolume() { //부피구하기 PI*radius*radius*height
//		return Math.PI*radius*radius*height;
//	}
//	
//	static public double getArea() { //면적구하기 PI*radius*radius*2+(2*PI*radius)*height
//		return Math.PI*radius*radius*2+(2*Math.PI*radius)*height;
//	}
//	
//	public static void main(String[]arg) {
//		
//		System.out.println("부피: " + getVolume());
//		System.out.println("겉넓이: "+ getArea());
//	}
	
}
