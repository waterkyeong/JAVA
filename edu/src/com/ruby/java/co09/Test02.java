package com.ruby.java.co09;

public class Test02 {

	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = "java";
		
		String s3 = new String("java");
		String s4 = "java";
		
		if(s1 == s3) {
			System.out.println("동일 객체");
		}else {
			System.out.println("다른 책체");
		}
		if(s2 == s4) {
			System.out.println("동일 객체");
		}else {
			System.out.println("다른객체");
		}
		
		if(s1.equals(s3)) {
			System.out.println("동일 문자열");
		}else {
			System.out.println("다른 문자열");
		}
		if(s2.equals(s4)) {
			System.out.println("동일 문자열");
		}else {
			System.out.println("다른 문자열");
		}
		
		String s5 = "JAVA";
		
		if(s1.equals(s5)) {
			System.out.println("동일 문자열");
		}else {
			System.out.println("다른 문자열");
		}
		
		if(s1.equalsIgnoreCase(s3)) {
			System.out.println("동일 문자열");
		}else {
			System.out.println("다른 문자열");
		}
		
	}

}
