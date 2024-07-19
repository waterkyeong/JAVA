package quiz;

import java.util.Scanner;

public class PrimeNumber3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) { 
			System.out.println("Number[0:exit]: ");
			int num = sc.nextInt();
			if (num == 0) break;
			
			for(int i = 1; i >= num; i++) {}
				int s = (int)Math.pow(10.0, (double)(num-1)); //거듭제곱 함수 ex) n이 3이면 100
				int e = (int)Math.pow(10.0, (double)(num))-1; //거듭제곱 함수 ex) n이 3이면 (1000-1)999 
				int count = 0;
				
				for(int num1 = s; num1 < e; num1++) {
					if(PrimeNumber1.isPrime(num1)) {
						System.out.println(num1 + " ");
						count++;
					}
				System.out.println("Number of Prim : " + count);
				}

		}
		System.out.println("Done!");
	}
}
