package com.Collections.java.pratice;

import java.util.LinkedHashSet;

public class RemoveDuplicatesCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String sourceStr="Deepak";
		
		
		
		 char[] chrArray = sourceStr.toCharArray();
	        LinkedHashSet<Character> set1 = new LinkedHashSet<Character>();
	        StringBuilder sb = new StringBuilder();
	        
	        // Loop over each character.
	        for (char value : chrArray) {
	            set1.add(value);
	        }
	        
	        for(char ch:set1) {
	            sb.append(ch);

	}
	System.out.println(sb);
	
	
	}
}
	

