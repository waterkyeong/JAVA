package chap4;

public class Test38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [][] = new int [5][5];
		int num = 1;
		for (int i =0; i<arr.length; i++) {
			for (int j =0; j<arr.length; j++) {
				arr[i][j]= num++;
				
			}
		}
		for (int[] n : arr) {
			for(int k: n) {
			System.out.print(k+" ");
			}
			System.out.println();
		}
		
		for(int i =0; i < arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("\n");
		}		
		
		int sum = 0;
		for(int i=0; i < arr.length; i++) {
			for( int j=0; j<=i; j++) {
				sum = sum + arr[i][j];
			}
		}
		System.out.println("합계 : " + sum);
	}
	
}
