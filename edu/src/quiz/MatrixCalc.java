package quiz;

import java.util.Random;
import java.util.Scanner;

public class MatrixCalc {

	private int [][] matrix = {
		{1,2,3},
		{4,5,6},
		{7,8,9}
	};
	

	
//	  public void work(boolean flag) { if (flag) getMatrix();
//	  
//	  for(int i = 0; i < matrix.length; i++) { //행의 수의 길이 //행의 합 변수선언
//		  int sum = 0; 
//		  for (int j = 0; j <matrix[0].length; j++) { 
//		  
//			  sum = sum + matrix[i][j]; 
//			  
//			  System.out.print(matrix[i][j]+"\t"); 
//		  }
//			  
//		  System.out.println("행의 합:" +sum); 
//	  }
//		  
//	  
//	  for(int j = 0; j < matrix[0].length; j++) { //열의 합 변수선언
//		  int sum1 = 0;  
//	  	for(int i = 0; i < matrix.length; i++){ 
//	  		sum1 = sum1 + matrix[i][j];
//	  		System.out.print(matrix[i][j]+"\t"); 
//	  	} 
//	  
//	  	System.out.println("열의 합:" + sum1); 
//	  }
//	  
//	 }
//	 
	
 	// program에서 true값일 때
	 
//	 private void getMatrix() { 
//		 Scanner sc = new Scanner(System.in); 
//		 Random rd =new Random();
//	 
//		 System.out.print("행과 열을 입력하세요 :");
//	 
//	 int n = sc.nextInt(); int m = sc.nextInt();
//	 
//	 matrix = new int [n][m];
//	 
//	 for (int i = 0; i<n; i++) { //배열완성 
//		for (int j = 0; j <m; j++) { 
//			matrix[i][j] = rd.nextInt(20); 
//		}
//	 } 
//	 sc.close();
//	 
//	 }
	
	
	private void getMatrix() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		int m = sc.nextInt();
		
		matrix = new int [n][m];
		for (int i = 0; i<n; i++) { //배열완성 
			for (int j = 0; j <m; j++) { 
				matrix[i][j] = sc.nextInt(); 
			}
			  
		} 
		sc.close();	  
	 }
	
	public void work(boolean flag) {
		if (flag) getMatrix();
	}
}

