package com.workz.workapp;

import java.util.Scanner;

public class RemoveWhiteSpace {
  
	public static void main(String[]args) {
		System.out.println("Enter the value : ");
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		
		char c[]=b.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]!=' ') {
				System.out.print(c[i]);
			}
			sc.close();
		}
	}
}
