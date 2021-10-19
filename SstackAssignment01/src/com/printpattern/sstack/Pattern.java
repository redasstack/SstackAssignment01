package com.printpattern.sstack;

public class Pattern {
	
	public static void main(String[] args) {
		
		int count=0;
		
		for(int i =1; i<=4; i++) {
			for(int j = 1;j<=i;j++) {
				//printing stars
				System.out.print("*");
			}
			System.out.println();				
		}
		
		System.out.println("...............");
		System.out.println();
		
		for(int i =4; i>=1; i--) {
			//printing stars
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();				
		}
		
		System.out.println("...............");
		System.out.println();
		
		for(int i =1; i<=4; i++) {
			//printing space
			for(int j=1;j<=4-i;j++) {
				System.out.print(" ");
			}
			//printing stars
			while(count != (2*i-1)) {
				System.out.print("*");
				count++;
			}
			count=0;
			System.out.println();				
		}
		
		System.out.println("...............");
		System.out.println();
		
		for(int i =4; i>=1; i--) {
			//printing space
			for(int j=0;j<=4-i;j++) {
				System.out.print(" ");
			}
			//printing stars
			count=0;
			while(count != (2*i-1)) {
				System.out.print("*");
				count++;
			}
			System.out.println();				
		}
		
	}

}
