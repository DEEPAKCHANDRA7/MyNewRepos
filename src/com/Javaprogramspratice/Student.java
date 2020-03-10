package com.Javaprogramspratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
	
	
	void studentDetails()throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please enter student name");
		String sname=br.readLine();
		System.out.println("please enter student rollno");
		int sroll=Integer.parseInt(br.readLine());
		System.out.println("enter student address");
		String saddr=br.readLine();
		System.out.println("student name is:"+sname);
		System.out.println("student rollno is:"+sroll);
		System.out.println("student address is:"+saddr);
		
		
	}void principal() throws IOException //(delegating responsibilities to caller method officeBoy())
	{ studentDetails();
	}
	void officeBoy()throws IOException //(delegating responsibilities to caller method main())
	{ principal();
	}
	public static void main(String[] args) throws IOException ///(delegating responsibilities to JVM)
	{ Student s1=new Student();
	s1.officeBoy();
	}
	
	
	
	

}
