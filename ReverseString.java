package com.workz.workapp;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[]args) {
	String str = "";
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char[] resultArray = input.toCharArray();
		
		for(int i=resultArray.length-1;i>=0;i--) {
			System.out.print(resultArray[i]);
			str = str + resultArray[i];
		}
		System.out.println();
		if(str.equals(input)) {
			System.out.println("The string is palindrone : ");
		}else {
			System.out.println("The string is not a palindrone : ");
		}
		sc.close();
		
	}
	
	}

