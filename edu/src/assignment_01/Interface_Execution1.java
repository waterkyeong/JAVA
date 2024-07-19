package assignment_01;

public class Interface_Execution1 {
	
	public static void main(String[]args) {
	
		Shape t = new Triangle(1,2,3,4,5,6);
		Shape r = new Rectangle(1,2,3,2,1,5,3,5);
		Shape s = new Square(1,2,3,2,1,5,3,5,3);
		
		System.out.println("삼각형 둘레 길이 = " + t.perimeter());
		System.out.println("삼각형 면적 = " + t.area());
		System.out.println("사각형 둘레 길이 = " + r.perimeter());
		System.out.println("사각형 면적 = " + r.area());
	}
}