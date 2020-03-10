package com.Javaprogramspratice;

public class ReversePyramind1 {

	public static void main(String[] args) {

		int n=20;
		
		
		for (int i=1;i<=n;i++) {
			
			
			for(int j=n;j>=i;j--) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
			
		
	}

}
