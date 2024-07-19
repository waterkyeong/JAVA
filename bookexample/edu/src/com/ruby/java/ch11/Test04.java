package com.ruby.java.ch11;

import java.io.*;

public class Test04 {

	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream("a.txt");
			int c = fi.read();
			System.out.println((char) c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
/*
	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileInputStream fi = new FileInputStream("a.txt");
		int c = fi.read();
		System.out.println((char) c);
	}*/
}