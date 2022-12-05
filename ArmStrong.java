package com.workz.workapp;

import java.util.Scanner;

public class ArmStrong {
	
	public static void main(String[]args) {
		
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		
		int temp = b;
		int z ,sum=0;
		while(b>0) {
			z = b%10;
			b=b/10;
			sum = sum + z*z*z;
		}
		if(temp==sum) {
			System.out.println("The given number is armstrong");
		}else {
			System.out.println("The given number is not a armstrong");
		}
		sc.close();
		
				
	}

}
