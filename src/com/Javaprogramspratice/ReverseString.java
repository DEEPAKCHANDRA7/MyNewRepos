package com.Javaprogramspratice;

public class ReverseString {

	public static void main(String[] args) {
		String original="DEED";
		String rev="";
		
		int len=original.length();
		
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+original.charAt(i);
		
		
		
		}
		System.out.println(rev);
		
  System.out.println(original);

  if(rev.equals(original)) {
	System.out.println("Palindrome of a String");
	
   }
else {
	
	System.out.println("Not a Palindrome of a String");
	
}
		
		
	}

	
	

}
