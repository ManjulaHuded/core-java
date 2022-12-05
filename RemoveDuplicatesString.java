package com.workz.workapp;

public class RemoveDuplicatesString {
	
	public static void main(String[] args) {
		String m = "rjhfieh";
		StringBuilder sd = new StringBuilder();
		for (int i = 0; i < m.length(); i++) {
			char ch = m.charAt(i);
			int indx = m.indexOf(ch, i+1);
			if(indx == -1) {
				sd.append(ch);
				
			}
			
		}
		System.out.println(sd);
	}

}
