package quiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MatrixMultiplication2 {
	private static int [][] loadMatrix(String fname){
		int [][] ret = null;
		List<String> list = new ArrayList<>();
		String str;
		
		//어디인진 모르겠지만 4x3, 3x4배열을 m1.txt, m.txt에 입력을 해줘야함.
		
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(fname))){
			while((str = br.readLine()) != null) {
				list.add(str);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		for(int i = 0; i <list.size(); i++) {
			String[] arr = list.get(i).split("\t");
			if(ret ==null) {
				ret = new int[list.size()][arr.length];
			}
			for(int j = 0; j <arr.length; j++) {
				ret[i][j] = Integer.parseInt(arr[j]);
			}
		}
		return ret;
	}
	//밑의 메소드 이요해서 행렬 곱하기
	private static void printMartix(int[][] m) {
		for(int i = 0; i < m.length; i ++) {
			for(int j = 0; j <m[0].length; j ++){
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("-".repeat(30));
	}
	
	
	private static int [][] caclMatrix(int[][] a, int[][] b){
			return null;
	}
	public static void main(String[] args) {
		int [][] a = loadMatrix("m.txt");
		if(a == null)return;
		printMartix(a);
		int [][] b = loadMatrix("m1.txt");
		if (b == null) return;
		printMartix(b);
		
		int[][] c = caclMatrix(a,b); // 이거하면 됨
		printMartix(c);
		}
	}


