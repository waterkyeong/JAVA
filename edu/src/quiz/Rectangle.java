package quiz;

import answer.Geometry;

public class Rectangle extends Geometry {
	private int[]xArr = {0,1,2,3}, yArr = {0,1,2,3};
	
//	public Rectangle(int[] xArr, int[] yArr) {
//		this.xArr = xArr;
//		this.yArr = yArr;
//	}
	
	@Override
	double getArea() {
		int Area = (int) (Math.sqrt(Math.pow(xArr[1] - xArr[0], 2) + Math.pow(yArr[1] - yArr[0], 2)) *Math.sqrt(Math.pow(xArr[2] - xArr[1], 2) + Math.pow(yArr[2] - yArr[1], 2)));
		return Area;
	}

	@Override
	double getLength() {
		int Length = (int) (2 * (Math.sqrt(Math.pow(xArr[1] - xArr[0], 2) + Math.pow(yArr[1] - yArr[0], 2)) + Math.sqrt(Math.pow(xArr[2] - xArr[1], 2) + Math.pow(yArr[2] - yArr[1], 2))));
		return Length;
	}



}
