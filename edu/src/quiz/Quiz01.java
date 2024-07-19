package quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두 수를 입력받아서 곱을 출력하세요
		//앞의 수를 뒤의 수로 나누어서 몫과 나머지를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 값:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
	    System.out.println("곱: 15 * 4 = "+ a*b);
		System.out.println("몫: 15 / 4 = "+a/b);
		System.out.println("나머지: 15 - (4*3) = "+ a%b);

	}

}