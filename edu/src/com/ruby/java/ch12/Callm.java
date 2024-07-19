package com.ruby.java.ch12;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Callm {

	public static void main(String[] args) {
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("m.txt"))){
			
			String m;
			
			while((m = br.read()) != -1) {
				out.w
			}
			
			
			//String str;
			//while((str = br.readline())!= null) 
			//	String[] arr = str.split
			System.out.println(m);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	
	
}

