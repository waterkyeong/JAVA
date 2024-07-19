package assignment_01;

public class Pentagon implements Shape {
	private int x1,y1,x2,y2,x3,y3,x4,y4,x5,y5;

	public Pentagon(int x1, int y1, int x2, int y2,int x3, int y3, int x4, int y4, int x5, int y5) {
	
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		this.y4 = y4;
		this.x4 = x4;
		this.x5 = x5;
		this.y5 = y5;
		
	}

	@Override
	public double perimeter() {
		
		int side1 = x1+y1;
		int side2 = x2+y2;
		int side3 = x3+y3;
		int side4 = x4+y4;
		int side5 = x5+y5;
		
		int sum = side1 + side2 + side3 + side4 + side5;
		return sum;
	}

	@Override
	public float area() {
		
		Triangle t = new Triangle(x1, y1, x2, y2, x3, y3);
		
		int area = (int) t.area()* 5;
		return area;
	}
	
	@Override
	public String toString() {
		return "Pentagon : "+"("+x1+", " + y1 + ")" + "("+x2+", " +y2 + ")"+"("+x3+", " +y3 + ")"+"("+x4+", " +y4 + ")"+"("+x5+", " +y5 + ")";
	}
}
