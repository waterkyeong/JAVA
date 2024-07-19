package assignment_01;

public class Interface_Execution2 {

	public static void main(String[] args) {
		Shape[]arr = new Shape[4];
		arr[0] = new Triangle(1,2,3,4,5,6);
		arr[1] = new Rectangle(1,2,3,2, 1,5,3,5);
		arr[2] = new Square(1,2,3,2,1,4,3,4,2);
		arr[3] = new Pentagon(5,1, 8,1,3,5,10,5,6,12);
		for(Object p : arr) {
			System.out.println(p.toString());
			
		}

	}

}
