package quiz;

import answer.Geometry;

public class TestGeometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Geometry[]xarr = new Geometry[5];
		Geometry[]yarr = new Geometry[5];
		
		
		
		xarr[0]= new Point();
		xarr[1]= new Line();
		xarr[2]= new Polyline();
		xarr[3]= new TriAngle();
		xarr[4]= new Rectangle();
		yarr[0]= new Point();
		yarr[1]= new Line();
		yarr[2]= new Polyline();
		yarr[3]= new TriAngle();
		yarr[4]= new Rectangle();
		
		for(Geometry a : xarr ) {
			a.getArea();
			a.getLength();
			
		};
		
	}

}
