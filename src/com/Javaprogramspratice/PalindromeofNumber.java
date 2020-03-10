package com.Javaprogramspratice;

public class PalindromeofNumber {

	public static void main(String[] args) {
		int rev=0,rem=0;
		
		int n=121;int temp=n;
		
		while(temp!=0) {
			
			
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
			
		}
if(n==rev) {
	
	System.out.println("Palindrome of a number "+rev);
	
}
else {
	
	System.out.println("Not a palindrome"+rev);
}

	}


	
}
