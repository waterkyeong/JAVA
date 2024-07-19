package quiz;

import answer.Geometry;

public class TriAngle extends Geometry {
	private int[]xArr = {0,1,2}, yArr = {0,1,2};
	
	@Override
	double getArea() {
		int Area = (int) ((Math.sqrt(Math.pow(xArr[1] - xArr[0], 2) + Math.pow(yArr[1] - yArr[0], 2)) +Math.sqrt(Math.pow(xArr[2] - xArr[1], 2) + Math.pow(yArr[2] - yArr[1], 2)) + Math.sqrt(Math.pow(xArr[2] - xArr[0], 2) + Math.pow(yArr[2] - yArr[0], 2)) )/2); 
		return Area;
	} 

	@Override
	double getLength() {
		int Length = 3*xArr[1];
		return Length;
	}
//	@Override
//	void XY(int[] xArr, int[] yArr) {
//		
//		
//		
//	}

}
