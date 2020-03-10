package com.Collections.java.pratice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {
		
		
		HashSet<String> h = new LinkedHashSet<String>();
		HashSet<Character> h2 = new LinkedHashSet<Character>();
		
		String second="Deepak";
		char [] chararray=second.toCharArray();
		
		for(char value:chararray) {
			h2.add(value);
			
			
		}
		
		System.out.println("value of h2"+h2);
		char[] array2 = new char[h2.size()];
      
		
		
		
		String str="IAM IAM IAM CHANDRA DEEPAK DEEPAK DEEPAK LEARNING JAVA JAVA IN FEW FEW FEW FEW FEW";
		
		String [] arr=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			
			
			if(!h.contains(arr[i])) {
				
				h.add(arr[i]);
				
				System.out.println(h);
				
				
				
				
				
				
			}
			
		}
		String[] array = new String[h.size()];
        h.toArray(array);
        System.out.println("Array: " + Arrays.toString(array));	
        
        System.out.println(array.toString());

        String str3 = Arrays.toString(array);
        System.out.println("int array as String in Java : " + str3);
        
        String joinedString = String.join(" ", array);
        
        System.out.println("Joined String "+joinedString);
        
        

}
}