package chap3;

public class Test28_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		while(true) {
			System.out.println("ok");
			cnt = cnt+2;
			if(cnt==10) {
				break;
			}
		}
		
		for(int i=0; i <10; i++) {
			if((i % 2)==0) continue;
			System.out.println(i);
			}
	}
		
}


