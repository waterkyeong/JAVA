package assignment_05;

/*
 * 객체를 정렬하는 코드 완성 
 * 스트링 배열을 정렬
 * 객체 배열을 정렬 
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
class Student{
	String sno;
	String sname;
	
	Student(String sno, String sname){
		this.sname = sname;
		this.sno = sno;
	}
	

	@Override
	public String toString() {
		
		return "Student :"+ sno +"," + sname;
	}

}
class SnoComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // 학번을 기준으로 비교
        return s1.sno.compareTo(s2.sno);
    }
}
public class GenObjArray02 {

	static <T>void showData(String msg, Object[]data) {
		System.out.println(msg);
		for(Object j: data) {System.out.println(j);}
	}
	public static void main(String[] args) {
		String [] stringData = {"apple","grape","blueberry","banana"};
		Student [] data = {
				new Student("12", "홍길동"),
				new Student("121", "홍길순"),
				new Student("213", "홍길춘"),
				new Student("9", "홍길홍")
		};
		showData("정렬전", stringData);
		Arrays.sort(stringData);
		showData("정렬후", stringData);
		showData("정렬전", data);
		Arrays.sort(data, new SnoComparator() {
			@Override
			public int compare(Student s1, Student s2) {
				return super.compare(s1, s2);
			}
		});
		showData("정렬후", data);
	}

}
