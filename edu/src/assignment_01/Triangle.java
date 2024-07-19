package assignment_01;

class Triangle implements Shape {
	private int x1,y1,x2,y2,x3,y3;
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;		
	}
	
	@Override
	public double perimeter() { //구글링으로 계산식 찾아서 구현
		
		int side1 = x1+y1;
		int side2 = x2+y2;
		int side3 = x3+y3;
		
		
		double sum = side1 + side2 + side3;
		return sum;
		
		
	}
	
	@Override
	public float area() {
		
		int side1 = x1+y1;
		int side2 = x2+y2;
		int side3 = x3+y3;
		
		int area = (side1 + side2 + side3)/2;
	
		return area;
	}
	
	@Override
	public String toString() {
		return "Triangle : "+"("+x1+", " + y1 + ")" + "("+x2+", " +y2 + ")"+"("+x3+", " +y3 + ")";
	}
	
}
	