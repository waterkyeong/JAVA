package assignment_05;
	import java.util.ArrayList;
/*
	 * 정수 배열을 정렬후 출력
	 * 실수 배열을 정렬후 출력
	 * 스트링 배열을 정렬후 출력하는 코드 완성 
	 */
	import java.util.Arrays;
import java.util.Random;

public class GenIntArray {
		
		private static <T> void showData(Object[]Data) {
			for(Object e : Data) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
		
		
	public static void main(String[] args) {
		
	
		
		int [] data = new int[20];
		Integer[]data2 = new Integer[20]; //나는 object는 객체의 최상위라 int와 double가 포함이 된다고 알고있었는데 showData의 objec에 걸리지 않음. 
										  //why? > int와 integer는 다른거고 하심. 그렇기때문에 object에 걸리지 않았음. 그래서 int를 integer로 변환시켜야함.
		double []doubleData = new double[20];
		Double[]doubleData2 = new Double[20];
		String [] stringData = {"apple","grape","blueberry","banana"};
		
		Random rnd = new Random();
		for (int i = 0; i < data.length; i++) {
			data [i] = rnd.nextInt(100);
			doubleData[i] = rnd.nextDouble()*100;
		}
			
		Arrays.sort(data);
		for (int i = 0; i < data.length;i++) {
			data2[i] =data[i];
		}
		showData(data2);
		Arrays.sort(doubleData);
		for (int i = 0; i < doubleData.length; i++) {
			doubleData2 [i] = doubleData[i];
		}
		showData(doubleData2);
		Arrays.sort(stringData);
		System.out.println();
		showData(stringData);
		//출력 
	}
	
	
}

