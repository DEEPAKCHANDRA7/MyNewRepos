package com.Javaprogramspratice;

public class FactorialRecursion {
	
	static int  fact=1;

	public static void main(String[] args) {
	
		
		int num=5;int result;
		
		FactorialRecursion f=new FactorialRecursion();
		
	result=f.calFact(num);
	
	System.out.println(result);
		
		
		
		
		
	}
int  calFact(int num) {
	
	
	if(num>=1) 
		
		
		fact=fact*num;
		
		calFact(num-1);
		
		return fact;
	}
	
	
}

