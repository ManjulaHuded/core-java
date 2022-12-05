package com.workz.workapp;

public class UniqueChar {
   
	public boolean uniqueCharecter(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
			if(str.charAt(i)==str.charAt(j)){
				return false;
			}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		UniqueChar char1 = new UniqueChar();
		String name = "hghdf";
		
		if(char1.uniqueCharecter(name)) {
			System.out.println("The string " + name + " has all unique charecter ");
		}
		else {
			System.out.println("The string " + name + " has not contain unique charecter ");
		}
		
	}
}
