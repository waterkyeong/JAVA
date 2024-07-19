package assigment_06;
/*
 * 		Comparator<Student2> compSno = new Comparator<Student2>(){
			@Override
			public int compare(Student2 s1, Student2 s2) {
				return 0;
			}
		};
 */
import java.util.ArrayList;
/*
 * public interface Comparator<T>{
 *    int compare(T 01, T 02);
 *    }
 *    
 * public interface Comparable<T> {
 *   public int compareTo(T o);
 *   }   
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;


class Student {
	String sno;
	String sname;
	
	Student(String sno, String sname){
		this.sname = sname;
		this.sno = sno;
	}
}

public class Lamdasic {
	
	static void sortStudents(Student[]students) {
		 Arrays.sort(students, (s1, s2) -> s1.sno.compareTo(s2.sno));
	}
	static void showStudents(String message, Student[]students) {
		System.out.println(message);
		for(Student student : students) {
			System.out.println("sno : " + student.sno + ", sname : " + student.sname);
		}
		System.out.println();
	}
	static void showStudents(String message, List<Student>students) {
		System.out.println(message);
		for(Student student : students) {
			System.out.println("sno : " + student.sno + ", sname : " + student.sname);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
//		Comparator<Student> compSno = new Comparator<Student>(){
//			@Override
//			public int compare(Student s1, Student s2) {
//				return Integer.parseInt(s1.sno)-Integer.parseInt(s2.sname);
//			}
//		};
        Student[] sArray = new Student[5];
        
        // Student 객체 생성 및 배열에 할당
        sArray[0] = new Student("121", "Alice");
        sArray[1] = new Student("33", "Bob");
        sArray[2] = new Student("9", "Charlie");
        sArray[3] = new Student("2", "John");
        sArray[4] = new Student("39", "Bobby");
        // ArrayList로 변환
        ArrayList<Student> sList = new ArrayList<>();
        for (Student student : sArray) {
            sList.add(student);
        }
        showStudents("sno 정렬전", sArray);
        //문제1: Arrays.sort()를 사용한 sArray 정렬 - sno 사용, 익명클래스 사용
//        Arrays.sort(sArray);
        Arrays.sort(sArray,new Comparator<Student>() {
        	@Override
        	public int compare(Student s1, Student s2) {
        		return s1.sno.compareTo(s2.sno);
        	};
        });
        showStudents("sno 정렬후", sArray);
        
        showStudents("sname 정렬전", sArray);
        //문제2: Arrays.sort()를 사용한 sArray 정렬 - sname 사용, 익명 객체 사용
        Arrays.sort(sArray,(new Comparator<Student>(){
        	// 여기 풀어라. 
             	@Override
        	public int compare(Student s1, Student s2) {
        		return (s1.sname.compareTo(s2.sname));
        	}
        }));
        showStudents("sname 정렬후", sArray);
        
        showStudents("sno 정렬전", sList);
        //문제3: Collections.sort()를 사용한 sList 정렬 - sno 사용, 람다식 사용
        Collections.sort(sList,(s1,s2) -> s1.sno.compareTo(s2.sno));
        showStudents("sno 정렬후", sList);
        
        showStudents("sname 정렬전", sList);
        //문제4: Collections.sort()를 사용한 sList 정렬 - sname 사용
        Collections.sort(sList, (s1,s2)-> s1.sname.compareTo(s2.sname));
        showStudents("sname 정렬후", sList);
        
        showStudents("sno 정렬전", sArray);
        //문제5: sortStudents()를 사용한 sArray 정렬 - sno 사용
        sortStudents(sArray);
        showStudents("sname 정렬후", sArray);
	}

}
