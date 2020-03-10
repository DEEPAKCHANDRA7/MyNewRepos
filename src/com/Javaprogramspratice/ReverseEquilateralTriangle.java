package com.Javaprogramspratice;

public class ReverseEquilateralTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		  for(int i=1;i<=n;i++) {
			  
			  for(int j=1;j<=i;j++) {
				  
				  System.out.print(" ");
			  }
			  
			  for(int k=n;k>=i;k--) {
				  
				  System.out.print("*");
			  }
			  System.out.println();
		  }
		  
		  
		  
		
		

	}

}
