package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.constant.Gender;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Patient {
	
	private String patientName;
	private String address;
	private Gender gender;
    private int age;
    
    public Patient() {
    	
    }
	
	public Patient(String patientName,String address,Gender gender,int age) {
		System.out.println("Patient object is created");
		this.patientName = patientName;
		this.address = address;
		this.gender = gender;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("Patient name is: " + patientName);
		System.out.println("Patient address is : " + address);
		System.out.println("Patient gender is: " + gender);
		System.out.println("Patient age is: "+age);
	}

}
