package com.Collections.java.pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListtoArrayVicevers {

	public static void main(String[] args) {
	
		
	ArrayList<String>al=new ArrayList<String>();
	al.add("anu");
	al.add("Sravya");
	al.add("ratan");
	al.add("natraj");
	
	String array[]=new String[al.size()];
	al.toArray(array);//conversion of array list into array
	
	for(int i=0;i<array.length;i++) {
		
		System.out.println(array[i]);
	}

	
	//conversion of array into array list
	
	ArrayList<String> al2 = new ArrayList<String>(Arrays.asList(array));
	
	
	System.out.println(al2);
	
	System.out.println("--------------------------------------------------------");
	System.out.println("printing the set elements");
	
	HashSet<String> h = new HashSet<String>();
	h.add("A");
	h.add("B");
	h.add("C");
	h.add("D");
	h.add("D");
	//creation of Iterator Object
	Iterator<String> itr = h.iterator();
	while (itr.hasNext())
	{ String str = itr.next();
	System.out.println(str);
	
	
	}
	
	String str="IAM IAM IAM CHANDRA DEEPAK DEEPAK DEEPAK LEARNING JAVA JAVA IN FEW FEW";
	
int count=1;

String [] arr=str.split(" ");
for(int i=0;i<arr.length;i++) {
	
	
	if(!h.contains(arr[i])) {
		
		h.add(arr[i]);
		
		System.out.println(h);
		
		Iterator<String> itr2 = h.iterator();
		while (itr.hasNext())
		{ String str2 = itr.next();
		System.out.println(str2);
		
	}
	
}
	
	


}}}
