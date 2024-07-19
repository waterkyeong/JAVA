package chap3;

public class Test31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =2; i <10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
//			System.out.println("\n"); 이건 두 줄 바꿈이 되어버린다.
			System.out.println(); //이게 한 줄 바꿈
		}

	}

}
