package com.Javaprogramspratice;

 class ChecknumISPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int n=9;int temp=0;
		
		for (int i=2;i<=n;i++) {
			
			if(n%i==0) {
				temp=temp+1;
				
			}
			
		}
		
		if(temp>0) {
			System.out.println("not a prime number");
		}
		else {
			System.out.println("its a a prime number");
		}
		
		}}
		
		
	
