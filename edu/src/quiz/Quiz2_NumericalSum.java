package quiz;

import java.util.Scanner;

public class Quiz2_NumericalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0보다 큰 하나의 정수를 입력 받아서 전체 합, 홀수 합, 짝수 합을 출력하세요.
		
			Scanner sc = new Scanner(System.in); // 입력받기위해 생성 
			while(true){
			System.out.println("입력[0:exit]: "); // 정수값을 받기 위한 메세지 출력
			int n = sc.nextInt(); // 정수형 값을 받아서 변수 n에 저장한다.
			if(n==0)  // 변수 n이 0과 같아지면 while문 나가기.
		    break;
	//		int sum = 0; 이건 쓸모없는 합
			int sum1 = 0; // 홀수 합 초기값 설정
			int sum2 = 0; // 
			
			for(int i = 1; i<= n; i++) { // 변수 i의 값은 1로 시작. 변수 i의 값이 변수 n의 값과 같거나 작으면 밑의 if문 실행. 그후 변수 i값 증가. 
				if( i % 2 == 0) // 변수 i의 값에서 2로 나눈 나머지의 값이 0이면 즉, i의 값이 짝수면 sum2를 실행, 
					sum2 += i; // sum2 = sum2 + i 0+1 1+2
				else //아니면 sum1을 실행.
					sum1 += i; 
			}
			System.out.println("전체 합:" + (sum1 + sum2));
			System.out.println("홀수 합" + sum1);
			System.out.println("짝수 합" + sum2);
	
		}
		System.out.println("종료");
	}
	
}