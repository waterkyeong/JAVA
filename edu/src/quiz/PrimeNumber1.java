package quiz;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Number[0:exit]: ");
			int num = sc.nextInt();
			if (num==0) break;
			if (isPrime(num)==true)
				System.out.println(num + "is a Prime");
			else
				System.out.println(num + "is not a Prime");
		}
		sc.close();
		System.out.println("Done!");
	}
	//num이 소수면 true, 그렇지 않으면 false를 리턴
	public static boolean isPrime(int num) {
		
		if(num == 1) return false;
		if(num == 2 || num == 3) return true;
		//코드작성
		//2~n-1까지 확인
		
//		for(int i = 2; i < num-1; i++) {
//			if(num%i == 0)
//				return false;
//		}
//		return true;
//		
//		//2~n/2까지 확인
//		
//		for(int i =2; i < num/2; i++) {
//			if(num%i == 0)
//			 return false;
//		}
//		return true;
		
		//2~Math.sqrt(n)까지 확인
		
		for(int i = 2; i  <=Math.sqrt(num); i++) {
			if(num%i == 0)
				return false;
			}
				return true;
			}
	
	public static boolean isPrimeAll(int n) {

		int i = 1;
		//String s = "" + n;
		String s = String.valueOf(n);

		while(true) {

			if(!isPrime(Integer.parseInt(s.substring(0, i++))))
				return false;
			if (s.length() < i)
				break;
		}		
		return true;
	}
	
	
	
//	public static boolean isPrimeAll(int num) {
//		int i = 1;
//		String s = String.valueOf(num);
//		while(true) {
//			if(!isPrime(Integer.parseInt(s.substring(0, i++))));
//				return false;
//			if(s.length()<i) break;
//
//			}
//		}
}
