package chap2;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte age;
		short point;
		int price;
		long totalSales;
		boolean isMarried = false;
		
		age =23;
		point = 32000;
		price = 3500000;
		totalSales = 2147483648L;
		
		System.out.println(age);
		System.out.println(point);
		System.out.println(price);
		System.out.println(totalSales);
		System.out.println("isMarried = \n"+ isMarried);
		char gender = 'A';
		System.out.println("\t gender = " + gender);
		char c = '\u0057';
				System.out.println("c = "+c);
		String greeting = "hello world";
				System.out.println("greetnig = "+ greeting);
	}

}
