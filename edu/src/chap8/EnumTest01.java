package chap8;

enum Status {
	READY ,SEND ,COMPLETE ,CLOSE 
}

public class EnumTest01{
	public static void main(String[]args) {
		Status work = null;
		
		int n =2;
		
		switch(n) {
		case 1:
			work = EnumTest01.READY;
			break;
		case 2:
			work = EnumTest01.SEND;
			break;
		case 3:
			work = EnumTest01.COMPLETE;
			break;
		case 4:
			work = EnumTest01.CLOSE;
			break;
		}
		System.out.println("현재 작업 상태 : " + work);
	}
}
