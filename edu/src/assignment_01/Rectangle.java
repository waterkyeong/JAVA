package assignment_01;

class Rectangle implements Shape {
	int x1,y1,x2,y2,x3, x4,y3,y4;
	
	public Rectangle(int x1, int y1, int x2, int y2,int x3, int y3, int x4, int y4) {
		
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		this.y4 = y4;
		this.x3 = x3;
		this.x4 = x4;
	
	}

	@Override
	public double perimeter() {
		
		int side1 = x1+y1;
		int side2 = x2+y2;
		int side3 = y3+x3;
		int side4 = y4+y4;
		
		int sum = side1 + side2 + side3 + side4;
		
		return sum;
	}

	@Override
	public float area() {
		
		int side1 = x1+y1;
		int side2 = x2+y2;


		int area = side1 * side2;
		
		return area;
	}
	

	@Override
	public String toString() {
		return "Rectangle : "+"("+x1+", " + y1 + ")" + "("+x2+", " +y2 + ")"+"("+x3+", " +y3 + ")"+"("+x4+", " +y4 + ")";

	
	
	
	
	}
}

 