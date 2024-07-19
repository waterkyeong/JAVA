package chap2;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		a++;
		System.out.println(a);//11
		++a;
		System.out.println(a);//12
		
	    int g;
		int b = 10;
		g= ++b;
	    System.out.println(b);
		
	    int c = 10;
	    c--;
	    System.out.println(c);//9
	    --c;
	    System.out.println(c);//8
	    
	    int d = 10;
	    int f = 10;
	    System.out.println(++d);//11
	    System.out.println(f++);//10
	    
	    int num = 42;
	    String binaryValue = Integer.toBinaryString(num);
	    System.out.println(binaryValue);
	}

}
