package quiz;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Number[0:exit]: ");
			int num = sc.nextInt();
			if (num == 0) break;
			
			int s = (int)Math.pow(10.0, (double)(num-1)); //거듭제곱 함수 ex) n이 3이면 100
			int e = (int)Math.pow(10.0, (double)(num))-1; //거듭제곱 함수 ex) n이 3이면 (1000-1)999 
			int count = 0;
			
			for(int n = s; n < e; n++) {
				if(PrimeNumber1.isPrime(n) == true) { System.out.println(n + " ");
				count++;
				}
				
			}
			System.out.println("Number of Prime : " + count);
			}
			
			
			
			
				
				
		System.out.println("Done!");
		}
		
	

	
//	public static boolean isPrime(int count) {   이거는 같은 패키지에 있는 primenumber1에 있는거니까 끌어다 써라!!
//		for(int i = 2; i  <=Math.sqrt(count); i++) {
//			if(count%i == 0)
//				return false;
//		}
//		return true;
//	}
//	
}

				//코드작성 0423 완벽한 소수가 안나옴,, 왜? 여긴 그 자릿수 사이에 나오는 소수 전부 > 근데 교수님거랑 내거랑 다름 왜 정확하게 안나오는지 알수있겠지 확인해보자.
//			for(int i = s; i <= e; i++) {
//				int count = 0;
//				for(int j = 2; j <i/2; j++) {
//					if(i%j == 0) {
//						break; }
//					else {
//						count = i;
//						System.out.println("Number of Prime : " + count);
//						break;
//					} 
//					
//				}
//				
//			}


// 이건 그 자릿수 내에 랜덤으로 소수 하나 뽑아주는것
//while(true) {
//	int count = (int)(Math.random()*(e-s))+s;
//	if(isPrime(count) == true) {
//		System.out.println("Number of Prime : " + count);
//		break;
//	}						
//}
//
//break;