package assignment_01;

public class Square extends Rectangle{
	int side;
	public Square(int x1, int y1, int x2, int y2,int x3, int y3, int x4, int y4, int side) {
		//super()를 사용
		super(x1, y1, x2, y2, x3, x4, y3, y4);
		
		this.side = side;
	}	
		@Override
		public String toString() {
			return "Square : "+"("+x1+", " + y1 + ")" + "("+x2+", " +y2 + ")"+"("+x3+", " +y3 + ")"+"("+x4+", " +y4 + ")";
		
	}
}
