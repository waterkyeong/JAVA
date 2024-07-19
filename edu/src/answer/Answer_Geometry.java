package answer;

import java.util.ArrayList;
import java.util.List;

abstract class Geometry{
	List<Integer> xArr = new ArrayList<>();
	List<Integer> yArr = new ArrayList<>();
	abstract double getArea();
	abstract double getLenght();
	
}

class Point extends Geometry{
	public Point(int x, int y) {
		xArr.add(x);
		yArr.add(y);
	}
	
	@Override
	double getArea() {
		return 0;
	}
	@Override
	double getLenght() {
		return 0;
	}

	public String toString() {
		return "["+xArr.get(0)+","+yArr.get(0)+"]";
	}
}

class Line extends Geometry{
	public Line(int x1, int y1, int x2, int y2) {
		xArr.add(x1);
		xArr.add(x2);
		yArr.add(y1);
		yArr.add(y2);
	}
	@Override
	double getArea() {
		return 0;
	}

	@Override
	double getLenght() {
		return 0;
	}
	
}

public class Answer_Geometry {

}
